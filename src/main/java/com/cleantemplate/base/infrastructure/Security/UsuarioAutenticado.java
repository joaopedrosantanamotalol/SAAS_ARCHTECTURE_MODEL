package com.cleantemplate.base.infrastructure.Security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.cleantemplate.base.domain.entities.Usuario;

@Component
public class UsuarioAutenticado {

    public Usuario get() {
        return ((UsuarioDetails)
            SecurityContextHolder.getContext()
            .getAuthentication()
            .getPrincipal())
            .getUsuario();
    }
}
