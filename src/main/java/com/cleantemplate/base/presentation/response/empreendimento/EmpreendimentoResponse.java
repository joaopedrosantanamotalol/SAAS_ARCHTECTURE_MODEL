package com.cleantemplate.base.presentation.response.empreendimento;

import com.cleantemplate.base.domain.entities.enums.empreendimento.EmpreendimentoENUM;
import com.cleantemplate.base.domain.entities.enums.empreendimento.PorteEnum;

public record EmpreendimentoResponse(
  Long id,
  String nome,
  String desc,
  String emailContato,
  EmpreendimentoENUM empreendimento,
  PorteEnum porte

) {}
