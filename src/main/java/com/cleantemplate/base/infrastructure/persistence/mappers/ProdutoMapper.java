package com.cleantemplate.base.infrastructure.persistence.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.cleantemplate.base.application.dto.AtualizarProdutoDTO;
import com.cleantemplate.base.application.dto.ProdutoRequest;
import com.cleantemplate.base.domain.entities.produto.Produto;
import com.cleantemplate.base.infrastructure.persistence.entities.Produto.ProdutoEntity;
import com.cleantemplate.base.presentation.response.ProdutoResponse;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoEntity toEntity(Produto produto);

    Produto toDomain(ProdutoEntity entity);

    @Mapping(target = "id", ignore = true)
    Produto toDomain(ProdutoRequest dto);

    @Mapping(target = "id", ignore = true)
    void updateProdutoFromDto(
            AtualizarProdutoDTO dto,
            @MappingTarget Produto produto
    );

    ProdutoResponse toResponse(Produto produto);
}
