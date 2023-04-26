package com.portfoliobackend.service;

import com.portfoliobackend.model.Educacion;
import com.portfoliobackend.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService implements IEducacionService{
    @Autowired
    public EducacionRepository eduRepository;
    @Override
    public List<Educacion> verEducaciones() {
        return eduRepository.findAll();
    }

    @Override
    public void crearEducacion(Educacion educacion, Long usuario_id) {
        educacion.setUsuario_id(usuario_id);
        eduRepository.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepository.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepository.findById(id).orElse(null);
    }
}
