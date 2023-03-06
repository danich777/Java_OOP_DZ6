import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WeatherPrint {
    public static final ObjectMapper objectMapper = new ObjectMapper();
    public static Weather weather = new Weather();
    public void print1dayWeather(String json) throws JsonProcessingException {

        weather.setDate(objectMapper.readTree(json).get("DailyForecasts").get(0).get("Date").asText());
        weather.setDescription(objectMapper.readTree(json).get("Headline").get("Text").asText());
        System.out.println(weather);

    }

    public void print5dayWeather(String json) throws JsonProcessingException {
        ArrayList <Weather>  list = new ArrayList<>();
        for ( Weather day : list){
            day.setDate(objectMapper.readTree(json).get("DailyForecasts").get(0).get("Date").asText());
            day.setDescription(objectMapper.readTree(json).get("Headline").get("Text").asText());
            System.out.println(day);
        }




    }

}

