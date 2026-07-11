package com.cleantemplate.base.domain.gateways.Pagamento;

import org.springframework.stereotype.Repository;

import com.cleantemplate.base.domain.entities.pagamento.Pagamento;

@Repository
public interface PagamentoGateway {
    Pagamento criarPix(Pagamento pagamento);
}
