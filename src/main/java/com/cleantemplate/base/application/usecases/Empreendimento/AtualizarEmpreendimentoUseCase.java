package com.cleantemplate.base.application.usecases.Empreendimento;

import org.springframework.stereotype.Service;

import com.cleantemplate.base.application.dto.Empreendimento.AtualizarEmpreendimentoDTO;
import com.cleantemplate.base.domain.entities.empreendimento.Empreendimento;
import com.cleantemplate.base.domain.gateways.Empreendimento.EmpreendimentoGateway;

@Service
public class AtualizarEmpreendimentoUseCase {

    private final EmpreendimentoGateway gateway;

    public AtualizarEmpreendimentoUseCase(EmpreendimentoGateway gateway) {
        this.gateway = gateway;
    }

    public Empreendimento executar(Long id,AtualizarEmpreendimentoDTO dto){
        return gateway.atualizar(id, dto);
    }
    
}