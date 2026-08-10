package com.cleantemplate.base.domain.gateways;

import java.util.List;

import com.cleantemplate.base.application.dto.Usuario.AtualizarProdutoDTO;
import com.cleantemplate.base.domain.entities.produto.Produto;

public interface ProdutoGateway {

    Produto salvar(Produto produto);

    List<Produto> listarProdutos();

    Produto atualizar(Long id, AtualizarProdutoDTO produto);

    void deletar(Long id);

}
