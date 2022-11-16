package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Fournisseur;
import com.example.mahdifehri.repository.FournisseurRepository;
import com.example.mahdifehri.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FournisseurServiceImp implements FournisseurServiceInt{
    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }
}
