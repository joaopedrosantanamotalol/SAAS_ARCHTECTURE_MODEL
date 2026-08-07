package com.cleantemplate.base.infrastructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleantemplate.base.infrastructure.persistence.entities.Empreendimento.EmpreendimentoEntity;

@Repository
public interface EmpreendimentoRepository extends JpaRepository<EmpreendimentoEntity, Long> {
    
}
