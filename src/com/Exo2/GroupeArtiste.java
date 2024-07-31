package com.Exo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GroupeArtiste extends ArtisteSolo{
    private List<Artistes> lesArtistes;

    public GroupeArtiste(String nationalite, int id, String nomDeScene, LocalDate anneeDeDebut, String nom, String prenom, LocalDate dateDeNaissance, List<Artistes> lesArtistes) {
        super(nationalite, id, nomDeScene, anneeDeDebut, nom, prenom, dateDeNaissance);
        this.lesArtistes = new ArrayList<>();
    }
}
