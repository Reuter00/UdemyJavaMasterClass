package LinkListChallange67;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {
    private String musicPlayerTitle;
    private ArrayList<Song> songArrayList;

    public MusicPlayer(String musicplayerTitle) {
        this.musicPlayerTitle = musicplayerTitle;
        this.songArrayList = new ArrayList<Song>();
    }

    public String getMusicPlayerTitle() {
        return musicPlayerTitle;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public void addSong(Song songName) {

        int ifHolder = findSong(songName);
        if (ifHolder == -1) {
            songArrayList.add(songName);
            System.out.println("'" + songName.getTitle() + "' was added to the playlist: " + musicPlayerTitle + " in position: " + findSong(songName));
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


    public void whatIsPlaying() {
        int whileCondition = 0;
        int arrayListLooper = 0;
        while (whileCondition == 0) {

            Scanner playerMenuInput = new Scanner(System.in);

            System.out.println("------------------------------");
            System.out.println("What do you want to do? ");
            if (songArrayList.get(songArrayList.size() - 1).getTitle() != "") {
                System.out.println(" 1 - Next song ");
            }
            System.out.println(" 2 - Previous song  ");
            System.out.println(" 3 - Replay song ");
            System.out.println(" 4 - List current playlist ");
            System.out.println(" 0 - Quit ");
            System.out.println("------------------------------");

            String userChoice = playerMenuInput.nextLine();//Returns String

            switch (userChoice) {
                case "1":


                    Song nowPlayingSong = this.songArrayList.get(arrayListLooper);
                    if ((arrayListLooper + 1) >= songArrayList.size()) {
                        System.out.println("-----------There is no next song, END OF LIST----------------");
                    } else {
                        Song nextSong = this.songArrayList.get(arrayListLooper + 1);
                        System.out.println(nowPlayingSong.getTitle() + " stopped playing, " + nextSong.getTitle() + " is now playing  ");
                        arrayListLooper = arrayListLooper + 1;
                    }
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "0":

                    System.out.printf("------------------------Music player will now stop playing------------------------");
                    whileCondition = 1;
                    break;


            }

        }

    }
}
