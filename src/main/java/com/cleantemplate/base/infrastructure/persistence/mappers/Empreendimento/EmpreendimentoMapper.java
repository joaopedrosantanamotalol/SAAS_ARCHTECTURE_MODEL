package com.cleantemplate.base.infrastructure.persistence.mappers.Empreendimento;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.cleantemplate.base.application.dto.Empreendimento.AtualizarEmpreendimentoDTO;
import com.cleantemplate.base.application.dto.Empreendimento.EmpreendimentoRequest;
import com.cleantemplate.base.domain.entities.empreendimento.Empreendimento;
import com.cleantemplate.base.infrastructure.persistence.entities.Empreendimento.EmpreendimentoEntity;
import com.cleantemplate.base.presentation.response.empreendimento.EmpreendimentoResponse;

@Mapper(componentModel = "spring")
public interface EmpreendimentoMapper {
    
    EmpreendimentoEntity toEntity   (Empreendimento emp);

    Empreendimento       toDomain   (EmpreendimentoEntity emp);

    @Mapping(target = "id", ignore = true)
    Empreendimento toDomain(EmpreendimentoRequest dto);

    @Mapping(target = "id", ignore = true)
    void updateEmpreendimentoFromDto(
            AtualizarEmpreendimentoDTO dto,
            @MappingTarget Empreendimento emp
    );

    EmpreendimentoResponse toResponse (Empreendimento emp);

}
