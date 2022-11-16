package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Produit;

public interface ProduitServiceInt extends GenericServiceInt<Produit, Long>{
    void assignProduitToStock(Long idProduit, Long idStock);
}
