package com.cleantemplate.base.presentation.response;

import com.cleantemplate.base.domain.entities.enums.produto.DisponibilidadeEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoResponse(
    Long id,
    @NotBlank String nomeProduto,
    @NotNull double valorProduto,
    @NotNull DisponibilidadeEnum disponibilidade,
    @NotNull int quantidade,
    @NotBlank String descricao,
    @NotBlank String marca
) {
}
