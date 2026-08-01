package com.cleantemplate.base.infrastructure.Security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.entities.Usuario.Usuario;
import com.cleantemplate.base.infrastructure.persistence.entities.UsuarioEntity;
import com.cleantemplate.base.infrastructure.persistence.mappers.UsuarioMapper;
import com.cleantemplate.base.infrastructure.persistence.repositories.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioDetailsService(
            UsuarioRepository usuarioRepository,
            UsuarioMapper usuarioMapper
    ) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
                
        System.out.println("EMAIL RECEBIDO LOGIN: " + email);
        UsuarioEntity entity = usuarioRepository.findByEmail(email)
                .orElseThrow(() ->
                    new UsernameNotFoundException("Usuário não encontrado"));

        Usuario usuario = usuarioMapper.toDomain(entity);

        return new UsuarioDetails(usuario);
    }
}