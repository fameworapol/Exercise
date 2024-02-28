package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RelevantFoodOutletsTest {

    public static void main(String[] args) throws Exception {
//		SpringApplication.run(DemoApplication.class, args);
        System.out.println("result = " + getRelevantFoodOutlets("Stories",15));
    }
    public static List<String> getRelevantFoodOutlets(String city, int maxCost) throws Exception {
//        String apiUrl = "https://jsonmock.hackerrank.com/api/food_outlets";
        List<String> cityList = new ArrayList<>();
        for (int i = 1; i <= maxCost; i++) {
            JsonObject jsonResponse = fetchApi(city,i);
            System.out.println(jsonResponse);
            String totalPage = jsonResponse.get("total_pages").getAsString();
            System.out.println("totalPage : "+totalPage);
            JsonArray data = jsonResponse.get("data").getAsJsonArray();
            List<String> cityListTemp = new ArrayList<>();
            for (JsonElement element : data) {
                if (element.getAsJsonObject().get("estimated_cost").getAsInt() < maxCost) {
                    String cityName = element.getAsJsonObject().get("name").getAsString();
                    cityListTemp.add(cityName);
                }
            }
            System.out.println("data round : "+i+" = "+cityListTemp);
        }
        return cityList;
    }

    public static JsonObject fetchApi(String city,int page) throws Exception{
        try {
            String apiUrl = "https://jsonmock.hackerrank.com/api/food_outlets?city="+city;
            //        String apiUrl = "https://jsonmock.hackerrank.com/api/food_outlets";
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            JsonObject result = new JsonObject();
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                System.out.println("API Response: " + response.toString());
                String responseResult = response.toString();
                JsonObject jsonResponse = new Gson().fromJson(response.toString(), JsonObject.class);
                result = jsonResponse;
                return result;
            }

        } catch (Exception e) {
            throw e;
        }
        return null;
    }
}
