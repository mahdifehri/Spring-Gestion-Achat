package com.example.mahdifehri.repository;

import com.example.mahdifehri.entity.CategorieProduit;
import com.example.mahdifehri.entity.Facture;

import java.util.List;

public interface FactureRepository extends GenericRepository<Facture,Long>{
    public List<Facture> findByFournisseur_IdFournisseur(Long id);
}
