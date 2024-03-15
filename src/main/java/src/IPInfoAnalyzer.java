package src;

import java.net.*;
import java.io.*;

public class IPInfoAnalyzer {


    public static void main(String[] args) {
        try {
            ConfigLoader configLoader = new ConfigLoader();
            String apiKey = configLoader.getProperty("api.key");
            String ip = "8.8.8.8"; // IP address to query

            URL url = new URL("https://ipinfo.io/" + ip + "/json?token=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}