package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.CategorieProduit;
import com.example.mahdifehri.repository.CategorieProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategorieProduitServiceImp extends GenericServiceImp<CategorieProduit,Long> implements CategorieProduitServiceInt{
    private CategorieProduitRepository categorieProduitRepository;
}
