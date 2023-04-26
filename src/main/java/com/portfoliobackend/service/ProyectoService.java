package com.portfoliobackend.service;

import com.portfoliobackend.model.Proyecto;
import com.portfoliobackend.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepository proyectoRepository;
    @Override
    public List<Proyecto> verProyectos() {
        return proyectoRepository.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto, Long id) {
        proyecto.setUsuario_id(id);
    proyectoRepository.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
    proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }
}
