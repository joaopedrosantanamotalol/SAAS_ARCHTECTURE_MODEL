package com.cleantemplate.base.application.usecases;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.entities.RoleEnum;
import com.cleantemplate.base.domain.entities.Usuario;
import com.cleantemplate.base.domain.gateways.UsuarioGateway;

@Service
public class DeletarUsuarioUseCase {
    private final UsuarioGateway gateway;

    public DeletarUsuarioUseCase(UsuarioGateway gateway) {
        this.gateway = gateway;
    }

    public void executar(Long id, Usuario usuarioLogado){

       if (usuarioLogado.getRole() != RoleEnum.ADMIN &&
        !usuarioLogado.getId().equals(id)) {

        throw new RuntimeException("Você só pode deletar seu próprio usuário");
    }

        gateway.deletar(id);

    }

}
