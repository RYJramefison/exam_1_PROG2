package com.Exo2;

import java.time.LocalDate;

public class Artistes {
    private int id;
    private String nomDeScene;
    private LocalDate anneeDeDebut;
    private String nationalite;

    public Artistes(String nationalite, int id, String nomDeScene, LocalDate anneeDeDebut) {
        this.nationalite = nationalite;
        this.id = id;
        this.nomDeScene = nomDeScene;
        this.anneeDeDebut = anneeDeDebut;
    }
}
