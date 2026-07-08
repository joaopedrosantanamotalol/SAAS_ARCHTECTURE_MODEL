package com.cleantemplate.base.application.usecases.Produto;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.application.dto.Usuario.AtualizarProdutoDTO;
import com.cleantemplate.base.domain.entities.produto.Produto;
import com.cleantemplate.base.domain.gateways.ProdutoGateway;

@Service
public class AtualizarProdutoUseCase {
    private final ProdutoGateway gateway;

    public AtualizarProdutoUseCase(ProdutoGateway gateway) {
        this.gateway = gateway;
    }

    public Produto executar(Long id, AtualizarProdutoDTO dto ){
        return gateway.atualizar(id, dto);
    }
}
