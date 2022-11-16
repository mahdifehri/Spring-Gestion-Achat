package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Operateur;

public interface OperateurServiceInt extends GenericServiceInt<Operateur, Long> {
    public void assignOperateurToFacture(Long idOperateur, Long idFacture);
}
