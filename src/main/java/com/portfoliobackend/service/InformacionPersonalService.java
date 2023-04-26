package com.portfoliobackend.service;

import com.portfoliobackend.model.InformacionPersonal;
import com.portfoliobackend.repository.InformacionPersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacionPersonalService implements IInformacionPersonalService{

    @Autowired
    public InformacionPersonalRepository infoPersRepository;
    @Override
    public List<InformacionPersonal> verInfoPersonales() {
        return infoPersRepository.findAll();
    }

    @Override
    public void crearInfoPersonal(InformacionPersonal info) {
    infoPersRepository.save(info);
    }

    @Override
    public void borrarInfoPersonal(Long id) {
    infoPersRepository.deleteById(id);
    }

    @Override
    public InformacionPersonal buscarInfoPersonal(Long id) {
        return infoPersRepository.findById(id).orElse(null);
    }
}
