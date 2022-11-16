package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Facture;

import java.util.List;

public interface FactureServiceInt {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture add(Facture f);
    Facture retrieveFacture(Long id);
    List<Facture> getFacturesByFournisseur(Long idFournisseur);
    Facture addFacture(Facture f, Long idFournisseur);
}
