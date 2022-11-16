package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Facture;
import com.example.mahdifehri.entity.Operateur;
import com.example.mahdifehri.repository.FactureRepository;
import com.example.mahdifehri.repository.OperateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperateurServiceImp extends GenericServiceImp<Operateur,Long> implements OperateurServiceInt{
@Autowired
    protected OperateurRepository operateurRepository;
@Autowired
protected FactureRepository factureRepository;

    @Override
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur operateur=operateurRepository.findById(idOperateur).orElse(null);
        Facture facture=factureRepository.findById(idFacture).orElse(null);
        if(operateur!=null && facture!=null)
        {
            operateur.getFactures().add(facture);
            operateurRepository.save(operateur);
        }
    }
}
