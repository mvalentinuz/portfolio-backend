package com.portfoliobackend.service;

import com.portfoliobackend.model.Usuario;
import com.portfoliobackend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    public UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> verUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public void crearUsuario(Usuario user) {
    usuarioRepository.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
    usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
