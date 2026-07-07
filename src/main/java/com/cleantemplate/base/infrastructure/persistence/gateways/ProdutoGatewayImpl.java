package com.cleantemplate.base.infrastructure.persistence.gateways;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cleantemplate.base.application.dto.AtualizarProdutoDTO;
import com.cleantemplate.base.domain.entities.produto.Produto;
import com.cleantemplate.base.domain.gateways.ProdutoGateway;
import com.cleantemplate.base.infrastructure.persistence.entities.Produto.ProdutoEntity;
import com.cleantemplate.base.infrastructure.persistence.mappers.ProdutoMapper;
import com.cleantemplate.base.infrastructure.persistence.repositories.ProdutoRepository;

@Repository
public class ProdutoGatewayImpl implements ProdutoGateway {
    private final ProdutoRepository repository;
    private final ProdutoMapper mapper;

    public ProdutoGatewayImpl(ProdutoRepository repository, ProdutoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Produto salvar(Produto produto){

        ProdutoEntity entity = mapper.toEntity(produto);

        ProdutoEntity saved = repository.save(entity);

        return mapper.toDomain(saved);
    }

    @Override
    public List<Produto> listarProdutos(){
        return repository.findAll()
        .stream()
        .map(mapper::toDomain)
        .toList();
    }

    @Override
    public Produto atualizar(Long id, AtualizarProdutoDTO dto){
        ProdutoEntity entity = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("não achado produto"));

        entity.setDescricao(dto.descricao());
        entity.setDisponibilidade(dto.disponibilidade());
        entity.setMarca(dto.marca());
        entity.setNomeProduto(dto.nomeProduto());
        entity.setQuantidade(dto.quantidade());
        entity.setValorProduto(dto.valorProduto());

        ProdutoEntity atualizado = repository.save(entity);

        return mapper.toDomain(atualizado);

    }

    @Override
    public void deletar(Long id){
        repository.deleteById(id);
    }

}
