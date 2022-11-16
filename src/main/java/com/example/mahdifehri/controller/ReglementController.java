package com.example.mahdifehri.controller;

import com.example.mahdifehri.entity.Reglement;
import com.example.mahdifehri.services.ReglementServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/reglement")
@RestController
public class ReglementController {
    @Autowired
    ReglementServiceInt reglementServiceInt;

    @GetMapping("/retreiveByFacture/{idFacture}")
    public List<Reglement> retrieveReglementByFacture(@PathVariable Long idFacture){
        return reglementServiceInt.retrieveReglementByFacture(idFacture);
    }
}
