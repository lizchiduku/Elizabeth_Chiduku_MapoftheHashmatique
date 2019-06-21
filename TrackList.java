import java.util.HashMap;

class TrackList {
    public void trackList() {
        HashMap<String,String> tracks = new HashMap<>();

//Track list//

        tracks.put("Simudza Maoko Ako","Urumbidze Mwari, ndiye ega akarurama, hona ndiye ega, ndiye, ndiye, ndiye wakarurama...");
        tracks.put("My Soul Says Yes", "My soul says yes, my soul says yes to your will, where you ytake me, i will follow...");
        tracks.put("Ich Hab Eins", "Ich hab eins, zwei, drei, vier bretter vor dem kopf... ");
        tracks.put("One, Two", "One, two, buckle my shoe three, four, knock at the door, five six, pick the stic, seven eight...");
        String name = tracks.get("Ich Hab");
        System.out.println("My Soul: "+name);

//Key set method//

        for (String key : tracks.keySet()) {
            System.out.println("Title: "+key);
            System.out.println("Lyrics: "+tracks.get(key));
            tracks.forEach((k, v) -> System.out.println(k + ": " + v));
        }
    }
}