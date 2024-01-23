package com.example.ProvinciesCiutats.Model;


import jakarta.persistence.*;

@Entity
@Table
public class Ciutat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nombre;
    private int poblacio;


    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

    public Ciutat() {
    }

    public Ciutat(int id, String nombre, int poblacio, Provincia provincia) {
        this.id = id;
        this.nombre = nombre;
        this.poblacio = poblacio;
        this.provincia = provincia;
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

    public int getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(int poblacio) {
        this.poblacio = poblacio;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
