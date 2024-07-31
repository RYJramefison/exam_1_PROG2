package com.Exo2;

import java.util.List;

public class Users {
    private List<PlayList> lesPlaylist;
    private List<PlayList> lesPlaylistFavoris;



    public void like(PlayList playList){
        int likes = playList.getLikes();
        likes++;
        playList.setLikes(likes);
        for (PlayList playList1 : lesPlaylist){
            if (playList1.equals(playList)){
                lesPlaylist.remove(playList1);
            }
            else {
                lesPlaylist.add(playList);
            }
        }
    }

//    public void countPlaylist(Chanson chanson) {
//        int countPLayist = 0;
//        for (PlayList playList : lesPlaylist) {
//            if (playList) {
//            }
//        }
//    }

    public void getTotalLikes(PlayList playList){
        playList.getLikes();
    }

}
