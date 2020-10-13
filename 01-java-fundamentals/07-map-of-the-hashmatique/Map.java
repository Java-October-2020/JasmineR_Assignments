import java.util.HashMap;
public class Map {
    public static void main(String[] args) {
        HashMap<String, String> Map = new HashMap<String, String>();
        Map.put("Twinkle Twinkle Little Star", "How i wonder what you are");
        Map.put("The Wheels on the Bus", "The wheels on the bus go round and round");
        Map.put("Baby Shark", "Baby Shark Doo Doo");
        String val = Map.get("Baby Shark");

        for(String key : Map.keyset()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, Map.get(key))); 
        }
    }
}
