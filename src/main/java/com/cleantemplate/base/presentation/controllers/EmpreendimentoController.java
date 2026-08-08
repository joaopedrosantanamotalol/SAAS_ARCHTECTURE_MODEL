package com.cleantemplate.base.presentation.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cleantemplate.base.application.dto.Empreendimento.AtualizarEmpreendimentoDTO;
import com.cleantemplate.base.application.dto.Empreendimento.EmpreendimentoRequest;
import com.cleantemplate.base.application.usecases.Empreendimento.ApagarEmpreendimentoUseCase;
import com.cleantemplate.base.application.usecases.Empreendimento.AtualizarEmpreendimentoUseCase;
import com.cleantemplate.base.application.usecases.Empreendimento.CriarEmpreendimentoUseCase;
import com.cleantemplate.base.application.usecases.Empreendimento.ListarEmpreendimentoUseCase;
import com.cleantemplate.base.domain.entities.empreendimento.Empreendimento;
import com.cleantemplate.base.infrastructure.persistence.mappers.Empreendimento.EmpreendimentoMapper;
import com.cleantemplate.base.presentation.response.empreendimento.EmpreendimentoResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/empreendimentos")
public class EmpreendimentoController {

    private final CriarEmpreendimentoUseCase criar;
    private final AtualizarEmpreendimentoUseCase atualizar;
    private final ApagarEmpreendimentoUseCase apagar;
    private final ListarEmpreendimentoUseCase listar;
    private final EmpreendimentoMapper mapper;

    public EmpreendimentoController(CriarEmpreendimentoUseCase criar, AtualizarEmpreendimentoUseCase atualizar,
            ApagarEmpreendimentoUseCase apagar, ListarEmpreendimentoUseCase listar, EmpreendimentoMapper mapper) {
        this.criar = criar;
        this.atualizar = atualizar;
        this.apagar = apagar;
        this.listar = listar;
        this.mapper = mapper;
    }

    @GetMapping("/listar")
    public List<EmpreendimentoResponse> listarEmpreendimento(){
        return listar.executar()
        .stream()
        .map(mapper::toResponse)
        .toList();
    }

    @PostMapping("/criar")
    public EmpreendimentoResponse criarEmpreendimento(
        @Valid @RequestBody EmpreendimentoRequest request
    ){
        Empreendimento criado = criar.executar(mapper.toDomain(request));
        return mapper.toResponse(criado);
    }

    @PutMapping("/atualizar/{id}")
    public EmpreendimentoResponse atualizarEmpreendimento(
        @PathVariable Long id ,
        @Valid @RequestBody AtualizarEmpreendimentoDTO dto
    ){
        Empreendimento emp = atualizar.executar(id, dto);
        return mapper.toResponse(emp);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(
        @PathVariable Long id
    ){
        apagar.executar(id);
    }

}
