package com.cleantemplate.base.infrastructure.persistence.mappers.Pagamento;

import org.mapstruct.Mapper;

import com.cleantemplate.base.application.dto.Pagamento.CriarPagamentoDTO;
import com.cleantemplate.base.domain.entities.pagamento.Pagamento;
import com.cleantemplate.base.presentation.response.PagamentoResponse;

@Mapper(componentModel = "spring")
public interface PagamentoMapper {
    
    Pagamento toDomain(CriarPagamentoDTO dto);

    PagamentoResponse toResponse(Pagamento pag);

}
