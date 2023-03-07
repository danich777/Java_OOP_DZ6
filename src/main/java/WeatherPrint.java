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
        weather.setMinTemp(objectMapper.readTree(json).get("DailyForecasts").get(0).
                get("Temperature").get("Minimum").get("Value").asText());
        weather.setMaxTemp(objectMapper.readTree(json).get("DailyForecasts").get(0).
                get("Temperature").get("Maximum").get("Value").asText());
        System.out.println(weather);

    }

    public void print5dayWeather(String json) throws JsonProcessingException {
        ArrayList <Weather>  list = new ArrayList<>();

        for (int i = 0; i<5; i++) {
            weather.setDate(objectMapper.readTree(json).get("DailyForecasts").get(i).get("Date").asText());

            weather.setDescription(objectMapper.readTree(json).get("Headline").get("Text").asText());
            weather.setMinTemp(objectMapper.readTree(json).get("DailyForecasts").get(i).
                    get("Temperature").get("Minimum").get("Value").asText());
            weather.setMaxTemp(objectMapper.readTree(json).get("DailyForecasts").get(i).
                    get("Temperature").get("Maximum").get("Value").asText());
            System.out.println(weather);

        }




    }

}

