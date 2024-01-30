package com.example.ProvinciesCiutats.controller;

import com.example.ProvinciesCiutats.Model.Pais;
import com.example.ProvinciesCiutats.Model.PaisRepositori;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
