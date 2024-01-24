package com.example.ProvinciesCiutats.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CiutatRepository extends CrudRepository<Ciutat,Integer> {
    Optional<Ciutat> findByNombre(String nombre);
}
