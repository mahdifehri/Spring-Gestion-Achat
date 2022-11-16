package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Produit;
import com.example.mahdifehri.entity.Reglement;
import com.example.mahdifehri.repository.ReglementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReglementServiceImp extends GenericServiceImp<Reglement,Long> implements ReglementServiceInt{
    @Autowired
    ReglementRepository reglementRepository;
    @Override
    public List<Reglement> retrieveReglementByFacture(Long idFacture) {
        return reglementRepository.findByFacture_IdFacture(idFacture);
    }
}
