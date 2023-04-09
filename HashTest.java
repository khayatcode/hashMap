import java.util.HashMap;
import java.util.Set;

public class HashTest {

    public static void main(String[] args){

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("I Want It That Way", "Tell me why Ain't nothin...");
        trackList.put("Africa", "I hear the drums echoing tonight...");
        trackList.put("Bohemian Rhapsody", "Is this the real life? Is this just fantasy?");
        trackList.put("Crazy", "I'm crazy for feeling so lonely...");

        System.out.println(trackList.get("Africa"));

        Set<String> keys = trackList.keySet();

        System.out.println("\n----- All Tracks with Songss -----");
        for(String track : keys){
            System.out.printf("\nTrack: %s",track);
            String songLyric = trackList.get(track);
            System.out.printf("\nSong: %s\n", songLyric);
        }
    }
    
}
