package com.portfoliobackend.service;

import com.portfoliobackend.model.Proyecto;

import java.util.List;

public interface IProyectoService {

    public List<Proyecto> verProyectos();
    public void crearProyecto(Proyecto proyecto, Long id);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);

}
