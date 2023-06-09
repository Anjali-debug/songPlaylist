import java.util.*;

public class Playlist {
    private final int playlistCapacity;
    private Map<String, LinkedList<String>> userAndSongsMap;

    public Playlist(int playlistCapacity) {
        this.playlistCapacity = playlistCapacity;
        userAndSongsMap = new HashMap<>();
    }
    public void addSong(String user, String song) {
        try {
            if (!userAndSongsMap.containsKey(user)) {
                userAndSongsMap.put(user, new LinkedList<>());
            }
            LinkedList<String> songs = userAndSongsMap.get(user);

            if (songs.contains(song)) {
                songs.remove(song);
            } else if (songs.size() >= playlistCapacity) {
                songs.removeLast();
            }
            songs.addFirst(song);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<String> getRecentlyPlayedSongs(String user) {
        try {
            LinkedList<String> songs = userAndSongsMap.get(user);
            if (songs != null) {
                return new ArrayList<>(songs);
            }
            return Collections.emptyList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
