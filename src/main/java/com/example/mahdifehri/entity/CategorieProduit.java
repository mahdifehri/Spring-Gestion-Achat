package com.example.mahdifehri.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCategorieProduit;
    private String codeProduit;
    private String libelleCategorieProduit;
    @OneToMany(mappedBy = "categorieProduit",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("categorieProduit")
    private List<Produit> produits;

}
