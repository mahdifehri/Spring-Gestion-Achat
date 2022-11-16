package com.example.mahdifehri.repository;

import com.example.mahdifehri.entity.Produit;
import com.example.mahdifehri.entity.Reglement;

import java.util.List;

public interface ReglementRepository extends GenericRepository<Reglement,Long>{
    public List<Reglement> findByFacture_IdFacture(Long idFacture);
}
