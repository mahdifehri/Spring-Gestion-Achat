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
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;
    @ManyToMany
    List<Fournisseur> fournisseurs;
}
