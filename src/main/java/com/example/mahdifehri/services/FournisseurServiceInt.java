package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Fournisseur;

import java.util.List;

public interface FournisseurServiceInt {
    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);
}
