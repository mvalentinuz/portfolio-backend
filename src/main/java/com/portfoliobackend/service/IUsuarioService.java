package com.portfoliobackend.service;

import com.portfoliobackend.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> verUsuarios();
    public void crearUsuario(Usuario user);
    public void borrarUsuario(Long id);
    public Usuario buscarUsuario(Long id);

}
