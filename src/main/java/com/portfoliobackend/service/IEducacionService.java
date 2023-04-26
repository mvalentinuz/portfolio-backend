package com.portfoliobackend.service;

import com.portfoliobackend.model.Educacion;

import java.util.List;

public interface IEducacionService {
    public List<Educacion> verEducaciones();
    public void crearEducacion(Educacion educacion, Long usuario_id);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);

}
