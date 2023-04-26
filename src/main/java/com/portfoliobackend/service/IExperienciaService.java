package com.portfoliobackend.service;

import com.portfoliobackend.model.Experiencia;

import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void crearExperiencia(Experiencia experiencia, Long id);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);

}
