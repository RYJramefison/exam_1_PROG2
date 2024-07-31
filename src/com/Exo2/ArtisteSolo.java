package com.Exo2;

import java.time.LocalDate;

public class ArtisteSolo extends Artistes{
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;

    public ArtisteSolo(String nationalite, int id, String nomDeScene, LocalDate anneeDeDebut, String nom, String prenom, LocalDate dateDeNaissance) {
        super(nationalite, id, nomDeScene, anneeDeDebut);
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }
}
