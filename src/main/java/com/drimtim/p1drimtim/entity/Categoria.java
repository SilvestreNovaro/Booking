package com.drimtim.p1drimtim.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Categoría")
@ToString
@Setter
@Getter
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // TODO podemos despues agregarle el @size y el notBlank
    private String titulo;
    private String descripcion;
    private String urlImagen;

}

// TODO aprender para que sirve el generation type?
