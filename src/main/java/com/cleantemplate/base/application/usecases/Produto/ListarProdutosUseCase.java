package com.cleantemplate.base.application.usecases.Produto;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.entities.Produto;
import com.cleantemplate.base.domain.gateways.ProdutoGateway;

@Service
public class ListarProdutosUseCase {
    private final  ProdutoGateway gateway;

    public ListarProdutosUseCase(ProdutoGateway gateway) {
        this.gateway = gateway;
    }

    public List<Produto> executar(){
        return gateway.listarProdutos();
    }
}
