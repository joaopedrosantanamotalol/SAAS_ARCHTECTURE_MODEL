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

import com.cleantemplate.base.application.dto.AtualizarProdutoDTO;
import com.cleantemplate.base.application.dto.ProdutoRequest;
import com.cleantemplate.base.application.usecases.Produto.AtualizarProdutoUseCase;
import com.cleantemplate.base.application.usecases.Produto.CriarProdutoUseCase;
import com.cleantemplate.base.application.usecases.Produto.DeletarProdutoUseCase;
import com.cleantemplate.base.application.usecases.Produto.ListarProdutosUseCase;
import com.cleantemplate.base.domain.entities.produto.Produto;
import com.cleantemplate.base.infrastructure.persistence.mappers.ProdutoMapper;
import com.cleantemplate.base.presentation.response.ProdutoResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final CriarProdutoUseCase criarUseCase;
    private final ListarProdutosUseCase listarUseCase;
    private final AtualizarProdutoUseCase atualizarUseCase;
    private final DeletarProdutoUseCase deletarUseCase;
    private final ProdutoMapper mapper;

    public ProdutoController(CriarProdutoUseCase criarUseCase, ListarProdutosUseCase listarUseCase,
            AtualizarProdutoUseCase atualizarUseCase, DeletarProdutoUseCase deletarUseCase, ProdutoMapper mapper) {
        this.criarUseCase = criarUseCase;
        this.listarUseCase = listarUseCase;
        this.atualizarUseCase = atualizarUseCase;
        this.deletarUseCase = deletarUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponse criar(
        @Valid @RequestBody ProdutoRequest request
    ){
        Produto criado = criarUseCase.executar(mapper.toDomain(request));
        return mapper.toResponse(criado);
    }    

    @GetMapping
    public List<ProdutoResponse> listar(){
        return listarUseCase.executar()
        .stream()
        .map(mapper::toResponse)
        .toList();
    }

    @PutMapping("/{id}")
    public ProdutoResponse atualizar(
        @PathVariable Long id,
        @Valid @RequestBody AtualizarProdutoDTO dto
    ){
       Produto produto = atualizarUseCase.executar(id, dto);

        return mapper.toResponse(produto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id){
        deletarUseCase.executar(id);
    }

    @GetMapping("/teste")
    public List<ProdutoResponse> teste() {

        return listarUseCase.executar()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}
