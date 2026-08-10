package com.cleantemplate.base.domain.gateways;

import java.util.List;

import com.cleantemplate.base.application.dto.Usuario.AtualizarUsuarioDTO;
import com.cleantemplate.base.domain.entities.Usuario.Usuario;

public interface UsuarioGateway {
    Usuario salvar(Usuario usuario);

    Boolean existeEmail(String email);

    List<Usuario> listarUsuarios();

    Usuario atualizar(String email, AtualizarUsuarioDTO usuario);

    Usuario atualizarPorId(Long id, AtualizarUsuarioDTO dto);

    void deletar(Long id);

    Usuario buscarUsuarioPorEmail(String email);

}
