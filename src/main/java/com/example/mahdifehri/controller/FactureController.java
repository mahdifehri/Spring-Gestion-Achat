package com.example.mahdifehri.controller;

import com.example.mahdifehri.entity.Facture;
import com.example.mahdifehri.services.FactureServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/facture")
@RestController
public class FactureController {
    @Autowired
    FactureServiceInt factureServiceInt;
    @GetMapping()
    public List<Facture> retrieveAllFactures(){
        return factureServiceInt.retrieveAllFactures();
    }
    @DeleteMapping("/delete/{id}")
    public void cancelFacture(@PathVariable Long id){
        factureServiceInt.cancelFacture(id);
    }
    @GetMapping("/{id}")
    public Facture retrieveFacture(Long id){
        return factureServiceInt.retrieveFacture(id);
    }
    @PostMapping("/add")
    public Facture add(@RequestBody Facture facture){
        return factureServiceInt.add(facture);
    }
    @GetMapping("/findbyfournisseur/{idFournisseur}")
    List<Facture> getFacturesByFournisseur(@PathVariable Long idFournisseur){
        return factureServiceInt.getFacturesByFournisseur(idFournisseur);
    }
    @PostMapping("/addFacture")
    Facture addFacture(@RequestBody Facture f, @PathVariable Long idFournisseur){
        return factureServiceInt.addFacture(f,idFournisseur);
    }
}
