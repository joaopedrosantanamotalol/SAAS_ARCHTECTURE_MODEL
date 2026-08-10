package com.cleantemplate.base.domain.gateways.Empreendimento;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cleantemplate.base.application.dto.Empreendimento.AtualizarEmpreendimentoDTO;
import com.cleantemplate.base.domain.entities.empreendimento.Empreendimento;

public interface EmpreendimentoGateway {

    Empreendimento salvar(Empreendimento empreendimento);

    List<Empreendimento> listarEmpreendimentos();

    Empreendimento atualizar(Long id, AtualizarEmpreendimentoDTO empreendimento);

    void deletar(Long id);
}
