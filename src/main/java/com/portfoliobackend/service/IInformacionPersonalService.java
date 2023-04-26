package com.portfoliobackend.service;

import com.portfoliobackend.model.InformacionPersonal;

import java.util.List;

public interface IInformacionPersonalService {

    public List<InformacionPersonal> verInfoPersonales();
    public void crearInfoPersonal(InformacionPersonal info);
    public void borrarInfoPersonal(Long id);
    public InformacionPersonal buscarInfoPersonal(Long id);

}
