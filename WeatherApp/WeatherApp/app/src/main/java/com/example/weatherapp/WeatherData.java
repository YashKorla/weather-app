package com.example.weatherapp;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

public class WeatherData {
    private String temperature, icon, city, weatherType;
    private int condition;

    public static WeatherData fromJSON(@NonNull JSONObject jsonObject) {
        try {
            WeatherData weatherData = new WeatherData();
            weatherData.city = jsonObject.getString("name");
            weatherData.condition = jsonObject.getJSONArray("weather").getJSONObject(0).getInt("id");
            weatherData.weatherType = jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
            weatherData.icon = updateWeatherIcon(weatherData.condition);
            double tempResult = jsonObject.getJSONObject("main").getDouble("temp") - 273.15;
            int roundedValue = (int) Math.rint(tempResult);
            weatherData.temperature = Integer.toString(roundedValue);

            return weatherData;
        }
        catch(JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String updateWeatherIcon(int condition) {
        if(condition >= 0 && condition < 300) {
            return "thunderstorm";
        }
        else if(condition >= 300 && condition < 500) {
            return "lightrain";
        }
        else if(condition >= 500 && condition <= 600) {
            return "rain";
        }
        else if(condition >= 600 && condition < 700) {
            return "snow";
        }
        else if(condition >= 701 && condition < 771) {
            return "fog";
        }
        else if(condition >= 772 && condition < 800) {
            return "overcast";
        }
        else if(condition == 800) {
            return "ic_sunny";
        }
        else if(condition >= 801 && condition <= 804) {
            return "ic_cloudy";
        }
        else if(condition >= 900 && condition <= 902) {
            return "thunderstorm";
        }
        else if(condition == 903) {
            return "snow";
        }
        else if(condition == 904) {
            return "ic_sunny";
        }
        else if(condition >= 905 && condition <= 1000) {
            return "thunderstorm";
        }
        return "ic_search";
    }

    public String getTemperature() {
        return temperature + "°C";
    }

    public String getIcon() {
        return icon;
    }

    public String getCity() {
        return city;
    }

    public String getWeatherType() {
        return weatherType;
    }
}
