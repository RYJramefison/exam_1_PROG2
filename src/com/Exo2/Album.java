package com.Exo2;

import java.time.LocalDate;
import java.util.List;

public class Album {
    private List<Chanson> chansons;
    private String artist;
    private int id;
    private static String nom;
    private LocalDate dateDeSortie;

    // single une chanson qui ne figure dans aucun


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Album.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(LocalDate dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public List<Chanson> getChansons() {
        return chansons;
    }

    public void setChansons(List<Chanson> chansons) {
        this.chansons = chansons;
    }
}
