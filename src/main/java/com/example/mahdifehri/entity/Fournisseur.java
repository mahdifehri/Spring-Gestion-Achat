package com.example.mahdifehri.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    private CategorieFournisseur categorieFournisseur;
    @ManyToMany(mappedBy ="fournisseurs")
    List<SecteurActivite> secteurActivites;
    @OneToOne(mappedBy = "fournisseur")
    DetailFournisseur detailFournisseur;
    @OneToMany(mappedBy = "fournisseur",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("fournisseur")
    private List<Facture> factures;
}
