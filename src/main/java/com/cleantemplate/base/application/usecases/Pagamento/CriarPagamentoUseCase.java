package com.cleantemplate.base.application.usecases.Pagamento;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.application.dto.Pagamento.CriarPagamentoDTO;
import com.cleantemplate.base.domain.entities.pagamento.Pagamento;
import com.cleantemplate.base.domain.gateways.Pagamento.PagamentoGateway;
import com.cleantemplate.base.infrastructure.persistence.mappers.Pagamento.PagamentoMapper;
import com.cleantemplate.base.presentation.response.PagamentoResponse;

@Service
public class CriarPagamentoUseCase {
    private final PagamentoGateway gateway;
    private final PagamentoMapper mapper;

    public CriarPagamentoUseCase(PagamentoGateway gateway, PagamentoMapper mapper) {
        this.gateway = gateway;
        this.mapper = mapper;
    }

    public PagamentoResponse executar(CriarPagamentoDTO dto){
        Pagamento pagamento = mapper.toDomain(dto);

        Pagamento criado = gateway.criarPix(pagamento);

        return mapper.toResponse(criado);
    }

}
