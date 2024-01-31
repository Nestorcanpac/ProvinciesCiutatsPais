package com.example.ProvinciesCiutats.controller;

import com.example.ProvinciesCiutats.Model.Ciutat;
import com.example.ProvinciesCiutats.Model.Pais;
import com.example.ProvinciesCiutats.Model.PaisRepositori;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PaisController {
    private final PaisRepositori paisRepositori;

    public PaisController (PaisRepositori paisRepositori){
        this.paisRepositori=paisRepositori;
    }

    @GetMapping("/pais")
    public String home(Model model){
      Iterable<Pais>  paisos = paisRepositori.findAll();
      model.addAttribute("paisos",paisos);
      return "LlistatPaisos";
    }

    @GetMapping("/pais/{id}")
    public String paisDetalls(@PathVariable int id, Model model){
        Pais pais= paisRepositori.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Pais no trobat amb id: "+id));
        model.addAttribute("pais",pais);
        return "PaisDetalls";
    }

}
