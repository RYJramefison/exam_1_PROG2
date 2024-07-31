package com.Exo2;

import java.time.Duration;

public class Chanson {
    private int id;
    private String titre;
    private Duration duree;
    private Genre genre;
    private int like;

    public Chanson(int id, String titre, Duration duree, Genre genre) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.genre = genre;
        this.like = 0;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
