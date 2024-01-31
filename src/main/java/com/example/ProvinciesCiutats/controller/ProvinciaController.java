package com.example.ProvinciesCiutats.controller;

import com.example.ProvinciesCiutats.Model.Pais;
import com.example.ProvinciesCiutats.Model.Provincia;
import com.example.ProvinciesCiutats.Model.ProvinciaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProvinciaController {
    private final ProvinciaRepository provinciaRepository;

    public ProvinciaController(ProvinciaRepository provinciaRepository){
        this.provinciaRepository=provinciaRepository;
    }

    @GetMapping("/provincia")
    public String home(Model model){
        Iterable<Provincia> provincias= provinciaRepository.findAll();
        model.addAttribute("provincias",provincias);
        return "LlistatProvincia";
    }

    @GetMapping("/provincia/{id}")
    public String paisDetalls(@PathVariable int id, Model model){
        Provincia provincia= provinciaRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Provincia no trobada amb id: "+id));
        model.addAttribute("provincia",provincia);
        return "ProvinciaDetalls";
    }

}
