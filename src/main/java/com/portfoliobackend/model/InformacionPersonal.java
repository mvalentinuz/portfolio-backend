package com.portfoliobackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class InformacionPersonal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String descripcion;
    private String urlFotoDePerfil;
    private String urlBanner;
    private String urlInstagram;
    private String correo;
}
