package Problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.*;

public class FoodOutLet {
    public static void main(String[] args) {
        getRelevantFoodOutlets("Denver", 50);
    }

    public static List<String> getRelevantFoodOutlets(String city, int maxCost) {
        String apiUrl = "https://jsonmock.hackerrank.com/api/food_outlets";
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                JSONParser parser = new JSONParser();

                reader.close();
                System.out.println("API Response: " + response.toString());

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
}
