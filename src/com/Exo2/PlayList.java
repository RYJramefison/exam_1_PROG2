package com.Exo2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class PlayList{
    private List<Chanson> playList;
    private int likes;



    public PlayList(List<Chanson> playList) {
        this.playList = playList;
        this.likes = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayList playList1 = (PlayList) o;
        return Objects.equals(playList, playList1.playList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(playList);
    }

    public void addToPlaylist(Chanson chanson){
        playList.add(chanson);
    }

    public List<Chanson> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Chanson> playList) {
        this.playList = playList;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void addToPlaylist(Album album){
//        playList.add(album)

    }

    public void removeById(int id){
        for (Chanson chanson : playList){
            if (chanson.getId() == id){
                playList.remove(chanson);
            }
        }
    }



    public Stream<Chanson> exclude(Genre genre){
        return playList.stream().filter(chanson -> chanson.getGenre().equals(genre));
    }


    public void countPlaylist(Chanson chanson){
        int countPLayist = 0;
        if (playList.contains(chanson)){
            countPLayist++;
        }
    }

    public void getTotalLikes(PlayList playList){

    }
}
