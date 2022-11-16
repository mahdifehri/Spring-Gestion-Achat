package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Produit;
import com.example.mahdifehri.entity.Reglement;

import java.util.List;

public interface ReglementServiceInt extends GenericServiceInt<Reglement, Long>{
    public List<Reglement> retrieveReglementByFacture(Long idFacture);
}
