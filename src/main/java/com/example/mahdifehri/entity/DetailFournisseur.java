package com.example.mahdifehri.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;
    @OneToOne
    @JoinColumn(name = "fournisseur_idFournisseur", referencedColumnName = "idFournisseur")
    private Fournisseur fournisseur;

}
