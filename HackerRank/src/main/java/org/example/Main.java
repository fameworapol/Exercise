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

public class Main {
    public static void main(String[] args) {
        long[] data = {1000000001 ,1000000002 ,1000000003 ,1000000004 ,1000000005};
//        List<List<Integer>> arr = new ArrayList<>({
//                {11, 2, 4},
//                {4 ,5 ,6},
//                {10, 8 ,-12}
//        });

        List<List<Integer>> arr = new ArrayList<>(List.of(List.of(11, 2, 4),List.of(4 ,5 ,6),List.of(10, 8 ,-12)));
        List<Long> a = new ArrayList<>();
        for (long element:
             data) {
            a.add(element);
        }
        //long result = aVeryBigSums(a);
        //long result = diagonalDifference(arr);
        List<String> result = getRelevantFoodOutlets("Denver",1500);
        System.out.println(result);
    }

    public static long aVeryBigSums(List<Long> ar) {
        // Write your code here
        long result = 0;
        for (int i = 0; i < ar.size(); i++) {
            result+=ar.get(i);
        }
        return  result;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        return 1;
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
                List<String> cityList = new ArrayList<>();
                reader.close();
                System.out.println("API Response: " + response.toString());
                String responseResult = response.toString();
                JsonObject jsonResponse = new Gson().fromJson(response.toString(), JsonObject.class);
                String totalPage = jsonResponse.get("total_pages").getAsString();
                JsonArray data = jsonResponse.get("data").getAsJsonArray();
                for (JsonElement element:data) {
                    if (element.getAsJsonObject().get("estimated_cost").getAsInt() < maxCost) {
                        String cityName = element.getAsJsonObject().get("name").getAsString();
                        System.out.println("cityName " + cityName);
                        cityList.add(cityName);
                    }
                }
                return  cityList;
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return  null;
    }
}