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

    @Override
    public void editarInfoPersonal(InformacionPersonal nuevaInfo) {
    InformacionPersonal infoActual = buscarInfoPersonal(nuevaInfo.getId());
    if(infoActual!=null)
         {
             if (nuevaInfo.getApellido()!=null)
             {
                 infoActual.setApellido(nuevaInfo.getApellido());
             }
             if (nuevaInfo.getNombre()!=null)
             {
                 infoActual.setNombre(nuevaInfo.getNombre());
             }
             if (nuevaInfo.getProfesion()!=null)
             {
                 infoActual.setProfesion(nuevaInfo.getProfesion());
             }
             if (nuevaInfo.getCorreo()!=null)
             {
                 infoActual.setCorreo(nuevaInfo.getCorreo());
             }
             if (nuevaInfo.getDescripcion()!=null)
             {
                 infoActual.setDescripcion(nuevaInfo.getDescripcion());
             }
             if (nuevaInfo.getUrlFotoDePerfil()!=null)
             {
                 infoActual.setUrlFotoDePerfil(nuevaInfo.getUrlFotoDePerfil());
             }
             if (nuevaInfo.getUrlBanner()!=null)
             {
                 infoActual.setUrlBanner(nuevaInfo.getUrlBanner());
             }
             if (nuevaInfo.getUrlInstagram()!=null)
             {
                 infoActual.setUrlInstagram(nuevaInfo.getUrlInstagram());
             }

             infoPersRepository.save(infoActual);
         }
    }
}
