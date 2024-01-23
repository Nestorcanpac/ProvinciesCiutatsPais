package com.example.ProvinciesCiutats.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nombre;
    private int poblacion;
    private String foto;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;




}
