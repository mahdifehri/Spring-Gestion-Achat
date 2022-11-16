package com.example.mahdifehri.entity;

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
public class Operateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idOperateur;
    private String nom;
    private String prenom;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Facture> factures;
}
