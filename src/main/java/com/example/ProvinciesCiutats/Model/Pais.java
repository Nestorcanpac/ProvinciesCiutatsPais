package com.example.ProvinciesCiutats.Model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;
    private String bandera;
    private int población;
    private int area_km2;

    @OneToMany(mappedBy = ("pais"), cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Provincia> provincias;

    public Pais() {
    }

    public Pais(int id, String nombre, String bandera, int población, int area_km2) {
        this.id = id;
        this.nombre = nombre;
        this.bandera = bandera;
        this.población = población;
        this.area_km2 = area_km2;
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

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public int getPoblación() {
        return población;
    }

    public void setPoblación(int población) {
        this.población = población;
    }

    public int getArea_km2() {
        return area_km2;
    }

    public void setArea_km2(int area_km2) {
        this.area_km2 = area_km2;
    }
}
