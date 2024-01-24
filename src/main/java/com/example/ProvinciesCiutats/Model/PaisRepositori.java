package com.example.ProvinciesCiutats.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaisRepositori extends CrudRepository<Pais,Integer> {
    Optional<Pais> findByNombre(String nombre);
}
