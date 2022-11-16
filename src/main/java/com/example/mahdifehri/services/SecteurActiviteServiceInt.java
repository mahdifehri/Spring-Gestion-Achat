package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.SecteurActivite;

public interface SecteurActiviteServiceInt extends GenericServiceInt<SecteurActivite, Long> {
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long
            secteurActiviteId) ;
}
