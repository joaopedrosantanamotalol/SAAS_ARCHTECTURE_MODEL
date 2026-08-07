package com.cleantemplate.base.application.dto.Empreendimento;

import com.cleantemplate.base.domain.entities.enums.empreendimento.EmpreendimentoENUM;
import com.cleantemplate.base.domain.entities.enums.empreendimento.PorteEnum;

public record EmpreendimentoRequest(
    String nome,
    String CNPJ,
    String desc,
    String emailContato,
    EmpreendimentoENUM empreendimento,
    PorteEnum porte
){}
