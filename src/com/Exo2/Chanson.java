package com.Exo2;

import java.time.Duration;

public class Chanson {
    private int id;
    private String titre;
    private Duration duree;
    private String genre;

    public Chanson(int id, String titre, Duration duree, String genre) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.genre = genre;
    }


}
