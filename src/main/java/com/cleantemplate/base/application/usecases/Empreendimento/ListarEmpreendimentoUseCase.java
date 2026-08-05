package com.cleantemplate.base.application.usecases.Empreendimento;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.domain.entities.empreendimento.Empreendimento;
import com.cleantemplate.base.domain.gateways.Empreendimento.EmpreendimentoGateway;

@Service
public class ListarEmpreendimentoUseCase {

    private final EmpreendimentoGateway gateway;

    public ListarEmpreendimentoUseCase(EmpreendimentoGateway gateway) {
        this.gateway = gateway;
    }

    public List<Empreendimento> listar(){
        return gateway.listarEmpreendimentos();
    }
    
}