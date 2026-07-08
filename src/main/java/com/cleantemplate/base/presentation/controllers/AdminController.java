package com.cleantemplate.base.presentation.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cleantemplate.base.application.dto.Usuario.CriarUsuarioDTO;
import com.cleantemplate.base.application.usecases.admin.CriarAdminUseCase;
import com.cleantemplate.base.domain.entities.Usuario.Usuario;
import com.cleantemplate.base.infrastructure.persistence.mappers.UsuarioMapper;
import com.cleantemplate.base.presentation.response.UsuarioResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminController {
    
    private final CriarAdminUseCase criarADM;
    private final UsuarioMapper mapper;

    public AdminController(CriarAdminUseCase criarADM, UsuarioMapper mapper) {
        this.criarADM = criarADM;
        this.mapper = mapper;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponse criarADM(   
        @Valid @RequestBody CriarUsuarioDTO dto
    ) {

        Usuario criado = criarADM.execute(
            mapper.toDomain(dto)
        );
        
        return mapper.toResponse(criado);
    }
}
