package com.cleantemplate.base.application.usecases.Produto;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.entities.produto.Produto;
import com.cleantemplate.base.domain.gateways.ProdutoGateway;

@Service
public class CriarProdutoUseCase {
    private final ProdutoGateway gateway;

    public CriarProdutoUseCase(ProdutoGateway gateway) {
        this.gateway = gateway;
    }

    public Produto executar(Produto produto){
        return gateway.salvar(produto);
    }
}
