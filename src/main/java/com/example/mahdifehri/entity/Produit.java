package com.example.mahdifehri.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @OneToMany(mappedBy = "produit",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("produit")
    private List<DetailFacture> detailFactures;
    @ManyToOne
    @JsonIgnoreProperties("produits")
    private Stock stock;
    @ManyToOne
    @JsonIgnoreProperties("produits")
    private CategorieProduit categorieProduit;
}
