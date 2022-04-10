import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Here Comes the Sun", "do do dodoo");
        trackList.put("Something", "in the way she moves");
        trackList.put("Come Together", "hair down to his knees");
        trackList.put("Octupus's Garden", "under the sea");
        Set<String> lyrics = trackList.keySet();
        for (String track : lyrics) {
            System.out.println(track);
            System.out.println(trackList.get(track));
        }
        System.out.println(trackList.get("Come Together"));
    }
}