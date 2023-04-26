package com.portfoliobackend.service;

import com.portfoliobackend.model.Experiencia;
import com.portfoliobackend.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    public ExperienciaRepository expRepository;
    @Override
    public List<Experiencia> verExperiencias() {
        return expRepository.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia experiencia, Long id) {
        experiencia.setUsuario_id(id);
        expRepository.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepository.findById(id).orElse(null);
    }
}
