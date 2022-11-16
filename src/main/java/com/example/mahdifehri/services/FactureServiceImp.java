package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Facture;
import com.example.mahdifehri.entity.Fournisseur;
import com.example.mahdifehri.repository.FactureRepository;
import com.example.mahdifehri.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactureServiceImp implements FactureServiceInt{
    @Autowired
    FactureRepository factureRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture facture=factureRepository.findById(id).orElse(null);
        if(facture!=null && facture.isArchivee())
        {
            factureRepository.delete(facture);
        }

    }

    @Override
    public Facture add(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
        return factureRepository.findByFournisseur_IdFournisseur(idFournisseur);
    }

    @Override
    public Facture addFacture(Facture f, Long idFournisseur) {
        Fournisseur fournisseur= fournisseurRepository.findById(idFournisseur).orElse(null);
        f.setFournisseur(fournisseur);
        return factureRepository.save(f);
    }
}
