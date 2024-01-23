package com.example.ProvinciesCiutats.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "provincia")
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


    @OneToMany(mappedBy = "provincia",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Ciutat> ciutatList;


    public Provincia() {
    }

    public Provincia(int id, String nombre, int poblacion, String foto, Pais pais, List<Ciutat> ciutatList) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.foto = foto;
        this.pais = pais;
        this.ciutatList = ciutatList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Ciutat> getCiutatList() {
        return ciutatList;
    }

    public void setCiutatList(List<Ciutat> ciutatList) {
        this.ciutatList = ciutatList;
    }
}
