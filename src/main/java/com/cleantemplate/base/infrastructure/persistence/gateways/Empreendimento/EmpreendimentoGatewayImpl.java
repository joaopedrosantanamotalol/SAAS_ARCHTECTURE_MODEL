package com.cleantemplate.base.infrastructure.persistence.gateways.Empreendimento;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cleantemplate.base.application.dto.Empreendimento.AtualizarEmpreendimentoDTO;
import com.cleantemplate.base.domain.entities.empreendimento.Empreendimento;
import com.cleantemplate.base.domain.gateways.Empreendimento.EmpreendimentoGateway;
import com.cleantemplate.base.infrastructure.persistence.entities.Empreendimento.EmpreendimentoEntity;
import com.cleantemplate.base.infrastructure.persistence.mappers.Empreendimento.EmpreendimentoMapper;
import com.cleantemplate.base.infrastructure.persistence.repositories.EmpreendimentoRepository;

@Repository
public class EmpreendimentoGatewayImpl implements EmpreendimentoGateway{
    
    private final EmpreendimentoRepository repository;
    private final EmpreendimentoMapper mapper;
    public EmpreendimentoGatewayImpl(EmpreendimentoRepository repository, EmpreendimentoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Empreendimento salvar(Empreendimento emp){
        EmpreendimentoEntity entity = mapper.toEntity(emp);

        EmpreendimentoEntity salva = repository.save(entity);

        return mapper.toDomain(salva);
    }

    @Override
    public List<Empreendimento> listarEmpreendimentos(){
        return repository.findAll()
        .stream()
        .map(mapper::toDomain)
        .toList();
    }

    @Override
    public Empreendimento atualizar(Long id, AtualizarEmpreendimentoDTO dto){

        EmpreendimentoEntity entity = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("não achado produto"));

        entity.setDesc(dto.desc());
        entity.setCNPJ(dto.CNPJ());
        entity.setEmailContato(dto.emailContato());
        entity.setEmpreendimento(dto.empreendimento());
        entity.setNome(dto.nome());
        entity.setPorte(dto.porte());

        EmpreendimentoEntity atualizado = repository.save(entity);

        return mapper.toDomain(atualizado);
    }

    @Override
    public void deletar(Long id){
        repository.deleteById(id);
    }

}
