package com.example.ProvinciesCiutats.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Ciutat {
    @Id
    @GeneratedValue()
}
