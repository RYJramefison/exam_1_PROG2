package com.Exo2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class PlayList{
    private List<Chanson> playList;
    private List<Chanson> favoris;



    public PlayList(List<Chanson> playList, List<Chanson> favoris) {
        this.playList = playList;
        this.favoris = favoris;
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

    public void like(Chanson chanson){
        int likes = chanson.getLike();
        likes++;
        chanson.setLike(likes);
        for (Chanson chanson1 : playList){
            if (chanson1.equals(chanson)){
                playList.remove(chanson1);
            }
            else {
                playList.add(chanson);
            }
        }
    }

    public Stream<Chanson> exclude(Genre genre){
        return playList.stream().filter(chanson -> chanson.getGenre().equals(genre));
    }



}
