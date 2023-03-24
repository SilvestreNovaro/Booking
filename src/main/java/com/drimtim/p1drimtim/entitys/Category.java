package com.drimtim.p1drimtim.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Categorys")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    // TODO Size?
    private String titulo;
    @Column
    private String descripcion;
    @Column
    private String urlImagen;


}
