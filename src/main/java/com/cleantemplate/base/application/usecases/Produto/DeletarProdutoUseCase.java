package com.cleantemplate.base.application.usecases.Produto;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.gateways.ProdutoGateway;

@Service
public class DeletarProdutoUseCase {
    private final ProdutoGateway gateway;

    public DeletarProdutoUseCase(ProdutoGateway gateway) {
        this.gateway = gateway;
    }

    public void executar(Long id){
        gateway.deletar(id);
    }

}
