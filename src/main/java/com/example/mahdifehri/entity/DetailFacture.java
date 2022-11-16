package com.example.mahdifehri.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idDetailFacture;
    private int qteCommandee;
    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    @JsonIgnoreProperties("detailFactures")
    private Facture facture;
    @ManyToOne
    @JsonIgnoreProperties("detailFactures")
    private Produit produit;
}
