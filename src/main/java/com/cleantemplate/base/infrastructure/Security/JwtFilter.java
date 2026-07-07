package com.cleantemplate.base.infrastructure.Security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.cleantemplate.base.domain.entities.Usuario.Usuario;
import com.cleantemplate.base.infrastructure.persistence.mappers.UsuarioMapper;
import com.cleantemplate.base.infrastructure.persistence.repositories.UsuarioRepository;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper mapper;

    public JwtFilter(
            JwtService jwtService,
            UsuarioRepository usuarioRepository,
            UsuarioMapper mapper
    ) {
        this.jwtService = jwtService;
        this.usuarioRepository = usuarioRepository;
        this.mapper = mapper;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {

        String token = null;

        // 1. Tenta pegar do HEADER
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7);
        }

        // 2. Se não tiver header, tenta COOKIE
        if (token == null && request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if ("token".equals(cookie.getName())) {
                    token = cookie.getValue();
                    break;
                }
            }
        }

        // 3. Se não tiver token, segue fluxo normal
        if (token == null) {
            filterChain.doFilter(request, response);
            return;
        }

        // 4. Valida token
        if (!jwtService.tokenValido(token)) {
            filterChain.doFilter(request, response);
            return;
        }

        // 5. Extrai usuário e autentica
        String email = jwtService.extrairEmail(token);

        var usuario = usuarioRepository.findByEmail(email);

        if (usuario.isPresent()) {
            
           Usuario usuarioDomain = mapper.toDomain(usuario.get());
           UsuarioDetails userDetails = new UsuarioDetails(usuarioDomain);

            var auth = new UsernamePasswordAuthenticationToken(
                userDetails,
                null,
                userDetails.getAuthorities()
            );

            auth.setDetails(
                    new WebAuthenticationDetailsSource().buildDetails(request)
            );

            SecurityContextHolder.getContext().setAuthentication(auth);
        }

        filterChain.doFilter(request, response);
    }
}