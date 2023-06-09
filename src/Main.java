import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Main class of Playlist");

        Playlist playlist = new Playlist(3);

        playlist.addSong("user1", "S1");
        playlist.addSong("user1", "S2");
        playlist.addSong("user1", "S3");
        playlist.addSong("user1", "S4");
        playlist.addSong("user1", "S5");

        playlist.addSong("user2", "S1");
        playlist.addSong("user2", "S2");
        playlist.addSong("user2", "S3");
        playlist.addSong("user2", "S4");
        playlist.addSong("user2", "S5");
        playlist.addSong("user2", "S6");

        List<String> user1Songs = playlist.getRecentlyPlayedSongs("user1");
        System.out.println("User1's Recently Played Songs:");
        for (String song : user1Songs) {
            System.out.println(song);
        }

        List<String> user2Songs = playlist.getRecentlyPlayedSongs("user2");
        System.out.println("User2's Recently Played Songs:");
        for (String song : user2Songs) {
            System.out.println(song);
        }
    }
}

