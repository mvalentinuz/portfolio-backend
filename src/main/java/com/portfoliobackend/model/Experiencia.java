package com.portfoliobackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String urlLogo;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Long usuario_id;
}
