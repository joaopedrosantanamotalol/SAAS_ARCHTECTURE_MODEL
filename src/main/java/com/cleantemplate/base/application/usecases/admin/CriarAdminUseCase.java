package com.cleantemplate.base.application.usecases.admin;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.entities.Usuario.Usuario;
import com.cleantemplate.base.domain.entities.enums.usuario.RoleEnum;
import com.cleantemplate.base.domain.gateways.UsuarioGateway;

@Service
public class CriarAdminUseCase {
     private final UsuarioGateway gateway;

    private final BCryptPasswordEncoder passwordEncoder;

    public CriarAdminUseCase(
        UsuarioGateway gateway,
        BCryptPasswordEncoder passwordEncoder
    ) {
        this.gateway = gateway;
        this.passwordEncoder = passwordEncoder;
    }
    

    public Usuario execute(Usuario usuario) {

        if (usuario.getEmail() == null || usuario.getSenha() == null) {
            throw new RuntimeException("Email ou senha inválidos");
        }

        if (gateway.existeEmail(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado");
        }

        usuario.setSenha(
            passwordEncoder.encode(usuario.getSenha())
        );

        usuario.setRole(RoleEnum.ADMIN);

        return gateway.salvar(usuario);
    }
}
