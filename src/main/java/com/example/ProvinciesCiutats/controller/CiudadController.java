package com.example.ProvinciesCiutats.controller;

import com.example.ProvinciesCiutats.Model.Ciutat;
import com.example.ProvinciesCiutats.Model.CiutatRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CiudadController {
    private final CiutatRepository ciutatRepository;

    public CiudadController(CiutatRepository ciutatRepository) {
        this.ciutatRepository = ciutatRepository;
    }

    @GetMapping("/ciutat")
    public String home(Model model){
        Iterable<Ciutat> ciutats= ciutatRepository.findAll();
        model.addAttribute("ciutats",ciutats);
        return "LlistatCiutats";
    }

    @GetMapping("/ciutat/{id}")
    public String ciutatDetalls(@PathVariable int id,Model model){
        Ciutat ciutat= ciutatRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Ciutat no trobada amb id: "+id));
        model.addAttribute("ciutat",ciutat);
        return "CiutatDetalls";
    }


}
