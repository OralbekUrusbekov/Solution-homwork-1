import FlyweightPattern.*;
import ProxyPattern.*;

// Main Class to Test Both Patterns
public class Main {
    public static void main(String[] args) {
        System.out.println("    Proxy Pattern Test    ");
        Image img1 = new ProxyImage("house1.jpg");
        img1.displayThumbnail(); // Show thumbnail immediately
        img1.displayFullImage(); // Load full image only when requested

        // Test Protection Proxy
        ImageUploader uploader = new ImageUploader(false);
        uploader.uploadImage("new_house.jpg"); // Should deny access

        ImageUploader agentUploader = new ImageUploader(true);
        agentUploader.uploadImage("new_house.jpg"); // Should allow upload

        System.out.println();

        // Flyweight Pattern Test
        System.out.println("    Flyweight Pattern Test   ");
        MapMarker m1 = new MapMarker("New York", "hospital", "red");
        MapMarker m2 = new MapMarker("Los Angeles", "restaurant", "blue");
        MapMarker m3 = new MapMarker("Chicago", "hospital", "red"); // Uses existing style
        MapMarker m4 = new MapMarker("San Francisco", "gas_station", "green");
        MapMarker m5 = new MapMarker("Boston", "restaurant", "blue"); // Uses existing style

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();

        // Log unique styles vs total markers
        System.out.println("Total unique styles created: " + MarkerFactory.getTotalStyles());
        System.out.println("Total markers displayed: 5");

        System.out.println();



    }


}

