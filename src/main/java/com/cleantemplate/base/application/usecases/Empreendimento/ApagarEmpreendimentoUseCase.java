package com.cleantemplate.base.application.usecases.Empreendimento;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.gateways.Empreendimento.EmpreendimentoGateway;

@Service
public class ApagarEmpreendimentoUseCase {

    private final EmpreendimentoGateway gateway;

    public ApagarEmpreendimentoUseCase(EmpreendimentoGateway gateway) {
        this.gateway = gateway;
    }

    public void executar(Long id){
        gateway.deletar(id);
    }
    
}