package com.example.mahdifehri.controller;

import com.example.mahdifehri.entity.Facture;
import com.example.mahdifehri.entity.Produit;
import com.example.mahdifehri.services.FactureServiceInt;
import com.example.mahdifehri.services.ProduitServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produit")
@RestController
public class ProduitController {
    @Autowired
    ProduitServiceInt produitServiceInt;
    @GetMapping()
    public List<Produit> retrieveAll(){
        return produitServiceInt.retrieveAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        produitServiceInt.remove(id);
    }
    @GetMapping("/{id}")
    public Produit retrieve(Long id){
        return produitServiceInt.retrieve(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody Produit p) {
        produitServiceInt.add(p);
    }
    @PutMapping("/assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit,@PathVariable Long idStock){
        produitServiceInt.assignProduitToStock(idProduit,idStock);
    }
}
