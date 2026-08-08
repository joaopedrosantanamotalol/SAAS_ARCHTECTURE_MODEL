package com.cleantemplate.base.application.usecases.Empreendimento;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.entities.empreendimento.Empreendimento;
import com.cleantemplate.base.domain.gateways.Empreendimento.EmpreendimentoGateway;

@Service
public class CriarEmpreendimentoUseCase {

    private final EmpreendimentoGateway gateway;

    public CriarEmpreendimentoUseCase(EmpreendimentoGateway gateway) {
        this.gateway = gateway;
    }

    public Empreendimento executar(Empreendimento emp){
        return gateway.salvar(emp);
    }

}