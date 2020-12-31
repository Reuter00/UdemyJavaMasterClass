package LinkListChallange67;

import exercise45Banking.Costumer;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songArrayList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songArrayList = new ArrayList<Song>();
    }


    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public void addSong(Song songName) {

        int ifHolder = findSong(songName);
        if (ifHolder == -1) {
            songArrayList.add(songName);
            System.out.println("'" + songName.getTitle() + "' was added to the playlist: " + albumName);
        } else {
            System.out.println("!------------------------------------ '" + songName.getTitle() + "' was already in the playlist: " + albumName + " ------------------------------------!");
        }
    }


    //Find song index
    private int findSong(Song song) {
        return this.songArrayList.indexOf(song);
    }

    //Find song name and compare with argument
    private int findSong(String songName) {
        for (int i = 0; i < this.songArrayList.size(); i++) {
            Song song = this.songArrayList.get(i);
            if (song.getTitle().equals(songName)) {
                return i;
            }
        }
        return -1;
    }
}
