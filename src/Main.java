import LinkListChallange67.Album;
import LinkListChallange67.MusicPlayer;
import LinkListChallange67.Song;


public class Main {
    public static void main(String[] args) {



        Song s1 = new Song("That way",4.30);
        Song s2 = new Song("Naruto silloulette",3.22);
        Song s3 = new Song("AOT opening",3.12);
        Song s4 = new Song("Year 3000",2.44);

        Album A1 = new Album("The one");
        Album A2 = new Album("Halloween");

        A1.addSong(s1);
        A1.addSong(s2);
        A1.addSong(s3);
        A1.addSong(s4);
        A1.addSong(s3);
        A1.addSong(s4);
        A2.addSong(s3);
        A2.addSong(s4);

        MusicPlayer m1 = new MusicPlayer("PDA 2020");

        m1.addSong(s1);
        m1.addSong(s2);

        m1.whatIsPlaying();



    }

}