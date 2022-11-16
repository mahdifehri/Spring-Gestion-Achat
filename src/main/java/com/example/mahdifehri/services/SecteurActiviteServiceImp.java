package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Fournisseur;
import com.example.mahdifehri.entity.SecteurActivite;
import com.example.mahdifehri.repository.FournisseurRepository;
import com.example.mahdifehri.repository.SecteurActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecteurActiviteServiceImp extends GenericServiceImp<SecteurActivite,Long> implements SecteurActiviteServiceInt{
   @Autowired
    FournisseurRepository fournisseurRepository;
   @Autowired
    SecteurActiviteRepository secteurActiviteRepository;

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        SecteurActivite secteurActivite = secteurActiviteRepository.findById(secteurActiviteId).orElse(null);
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        if(secteurActivite!=null && fournisseur!=null){
            secteurActivite.getFournisseurs().add(fournisseur);
            fournisseur.getSecteurActivites().add(secteurActivite);
            secteurActiviteRepository.save(secteurActivite);
            fournisseurRepository.save(fournisseur);
        }
    }
}
