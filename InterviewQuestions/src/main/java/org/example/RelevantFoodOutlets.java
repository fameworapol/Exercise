package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RelevantFoodOutlets {
    public static void main(String[] args) {
        getRelevantFoodOutlets("Dendever",1500);
    }

    private static final String RESTURL = "https://jsonmock.hackerrank.com/api/food_outlets";

    public static List<String> getRelevantFoodOutlets(String city, int maxCost)
    {
        int page = 1;
        List<String> cityList = new ArrayList<>();
        try {
            cityList = getCities(city, page ,maxCost);
        } catch (Exception e) {
            System.out.println("Exception "+e);
        }
        return cityList;
    }

    public static List<String> getCities(String city, int page, int maxcost) throws Exception {

        List<String> cityList = new ArrayList<>();
        String cityName = null;
        String response = getResponsePerPage(RESTURL,city, page);

        JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
        int totalPages = jsonResponse.get("total_pages").getAsInt();
        JsonArray data = jsonResponse.getAsJsonArray("data");

        for (JsonElement e : data) {
            if(e.getAsJsonObject().get("estimated_cost").getAsInt() < maxcost) {
                cityName = e.getAsJsonObject().get("name").getAsString();
                System.out.println("cityName "+cityName);
                cityList.add(cityName);
            }

        }
        return totalPages==page? cityList : getCities(city, page+1, maxcost);
    }

    public static String getResponsePerPage(String endpoint,String city, int page) throws MalformedURLException, IOException, ProtocolException {

        String newurl = endpoint+"?city="+city+"&page="+page;
        System.out.println("New Url "+newurl);
        URL url = new URL(newurl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.addRequestProperty("Content-Type", "application/json");

        int status = con.getResponseCode();
        if(status<200 || status>=300) {
            throw new IOException("Error in reading data with status:"+status);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String response;
        StringBuilder sb = new StringBuilder();
        while((response = br.readLine())!=null) {
            sb.append(response);
        }

        br.close();
        con.disconnect();
        return sb.toString();
    }
}
