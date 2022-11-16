package com.example.mahdifehri.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date DerniereModification;
    private boolean archivee;
    @OneToMany(mappedBy = "facture",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("facture")
    private List<Reglement> reglements;
    @OneToMany(mappedBy = "facture",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("facture")
    private List<DetailFacture> detailFactures;
    @ManyToOne
    @JsonIgnoreProperties("factures")
    private Fournisseur fournisseur;

}
