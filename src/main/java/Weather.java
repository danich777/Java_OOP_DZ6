

public class Weather {

    private String date;
    private String description;

    public Weather() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Погода" +
                "Дата: " + date + '\'' +
                ", прогноз" + description;
    }
}

