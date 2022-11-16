package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Produit;
import com.example.mahdifehri.entity.Stock;
import com.example.mahdifehri.repository.ProduitRepository;
import com.example.mahdifehri.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImp extends GenericServiceImp<Produit,Long> implements ProduitServiceInt{
@Autowired
    protected ProduitRepository produitRepository;
@Autowired
protected StockRepository stockRepository;

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        if(produit!=null && stock!=null){
            produit.setStock(stock);
            produitRepository.save(produit);
        }
    }
}
