package com.cleantemplate.base.infrastructure.persistence.gateways.Pagamento;

import com.cleantemplate.base.domain.entities.pagamento.Pagamento;
import com.cleantemplate.base.domain.gateways.Pagamento.PagamentoGateway;

public class PagamentoGatewayImpl  implements PagamentoGateway{
    
    @Override
    public Pagamento criarPix(Pagamento pagamento){
        return pagamento;
    }

}
