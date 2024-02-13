package com.example.ProvinciesCiutats.controller;

import com.example.ProvinciesCiutats.Model.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class LlistesController {

    private final CiutatRepository ciutatRepository;

    private final PaisRepositori paisRepository;
    private final ProvinciaRepository provinciaRepository;
    public LlistesController(
            CiutatRepository ciutatRepository,
            PaisRepositori paisRepository,
            ProvinciaRepository provinciaRepository) {
        this.ciutatRepository = ciutatRepository;
        this.paisRepository = paisRepository;
        this.provinciaRepository = provinciaRepository;
    }
    @GetMapping("/ciutat")
    public String llistatCiutats(Model model) {
        Iterable<Ciutat> ciutats = ciutatRepository.findAll();
        model.addAttribute("nomEntitat","Ciutats");
        model.addAttribute("entitat", ciutats);
        return "Llistat";
    }


    @GetMapping("/pais")
    public String llistatPaisos(Model model) {
        Iterable<Pais> paisos = paisRepository.findAll();
        model.addAttribute("nomEntitat","Paisos");
        model.addAttribute("entitat", paisos);
        return "Llistat";
    }
    @GetMapping("/provincia")
    public String llistatProvincies(Model model) {
        Iterable<Provincia> provincies = provinciaRepository.findAll();
        model.addAttribute("nomEntitat","Provincies");
        model.addAttribute("entitat", provincies);
        return "Llistat";
    }


}
