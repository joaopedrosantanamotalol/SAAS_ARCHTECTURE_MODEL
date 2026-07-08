package com.cleantemplate.base.application.usecases.Usuario;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.application.dto.Usuario.AtualizarUsuarioDTO;
import com.cleantemplate.base.domain.entities.Usuario.Usuario;
import com.cleantemplate.base.domain.gateways.UsuarioGateway;

@Service
public class AtualizarUsuarioUseCase {

    private final UsuarioGateway gateway;

    public AtualizarUsuarioUseCase(UsuarioGateway gateway) {
        this.gateway = gateway;
    }

    public Usuario executar(Long id, AtualizarUsuarioDTO usuario){
        return gateway.atualizar(id, usuario);
    }

}