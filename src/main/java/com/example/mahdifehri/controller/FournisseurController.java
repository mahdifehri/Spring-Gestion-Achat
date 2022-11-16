package com.example.mahdifehri.controller;

import com.example.mahdifehri.entity.Fournisseur;
import com.example.mahdifehri.services.FournisseurServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fournisseur")
@RestController
public class FournisseurController {
    @Autowired
    FournisseurServiceInt fournisseurServiceInt;
    @GetMapping()
    public List<Fournisseur> retrieveAllFournisseurs(){
        return fournisseurServiceInt.retrieveAllFournisseurs();
    }
    @PostMapping("/add")
    public Fournisseur addFournisseur (@RequestBody Fournisseur f){
        return fournisseurServiceInt.addFournisseur(f);
    }
    @PutMapping("/edit")
    public Fournisseur updateFournisseur (@RequestBody Fournisseur f){
        return fournisseurServiceInt.updateFournisseur(f);
    }
    @GetMapping("/{id}")
    public Fournisseur retrieveFournisseur (@PathVariable Long id){
        return fournisseurServiceInt.retrieveFournisseur(id);
    }
}
