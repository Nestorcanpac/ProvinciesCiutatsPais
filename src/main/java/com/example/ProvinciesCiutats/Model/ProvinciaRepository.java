package com.example.ProvinciesCiutats.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProvinciaRepository extends CrudRepository<Provincia,Integer> {
    Optional<Provincia> findByNombre(String nombre);
}
