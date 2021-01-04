package LinkListChallange67;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {
    final String musicPlayerTitle;
    final ArrayList<Song> songArrayList;

    public MusicPlayer(String musicPlayerTitle) {
        this.musicPlayerTitle = musicPlayerTitle;
        this.songArrayList = new ArrayList<>();
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




    public void whatIsPlaying() {
        int whileCondition = 0;
        int arrayListLooper = 0;
        while (whileCondition == 0) {

            Scanner playerMenuInput = new Scanner(System.in);

            System.out.println("------------------------------");
            System.out.println("What do you want to do? ");
            if ((arrayListLooper + 1) >= songArrayList.size()) {
                System.out.println(" |||| End of List ||||");
            } else {

                System.out.println(" 1 - Next song ");
            }
            if (arrayListLooper == 0) {
                System.out.println(" |||| Start of List ||||");
            } else {
                System.out.println(" 2 - Previous song  ");
            }
            System.out.println(" 3 - Replay song ");
            System.out.println(" 4 - List current playlist ");
            System.out.println(" 0 - Quit ");
            System.out.println("------------------------------");

            String userChoice = playerMenuInput.nextLine();//Returns String

            switch (userChoice) {
                case "1":

                    if ((arrayListLooper + 1) < songArrayList.size()) {

                        //Creation of the song now and next playing
                        Song nowPlayingSong = this.songArrayList.get(arrayListLooper);
                        Song nextSong = this.songArrayList.get(arrayListLooper + 1);

                        System.out.println(nowPlayingSong.getTitle() + " stopped playing, " + nextSong.getTitle() + " is now playing  ");
                        arrayListLooper = arrayListLooper + 1;
                    } else {
                        System.out.println("You reached the end of the playlist!");
                    }
                    break;
                case "2":
                    if ((arrayListLooper - 1) >= 0) {

                        //Creation of the song now and next playing
                        Song nowPlayingSong = this.songArrayList.get(arrayListLooper);
                        Song previousSong = this.songArrayList.get(arrayListLooper - 1);

                        System.out.println(nowPlayingSong.getTitle() + " stopped playing, " + previousSong.getTitle() + " is now playing  ");
                        arrayListLooper = arrayListLooper - 1;
                    } else {
                        System.out.println("You reached the start of the playlist!");
                    }
                    break;
                case "3":

                    Song nowPlayingSong = this.songArrayList.get(arrayListLooper);
                    System.out.println(nowPlayingSong.getTitle() + " is now repeating  ");

                    break;
                case "4":

                    System.out.println("Playlist songs:");
                    for (int i = 0; i < songArrayList.size(); i++) {
                        System.out.println(" " + (i+1) + " - " + songArrayList.get(i).getTitle() );
                    }


                    break;
                case "0":

                    System.out.print("------------------------Music player stopped playing------------------------");
                    whileCondition = 1;
                    break;


            }

        }

    }
}
