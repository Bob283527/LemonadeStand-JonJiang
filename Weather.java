import java.util.Random;

public class Weather {

    private final String[] weatherConditions = {"Sunny", "Rainy", "Cloudy", "Hazy"};
    private int minTemp = 0;
    private int maxTemp = 100;
    private int minCond = 0;
    private int maxCond = 3;

    private String currentCondition;
    private int currentTemperature;

    // Method to randomly choose weather condition
    public void generateWeather() {
        Random rand = new Random();
        int randNum = rand.nextInt((maxCond - minCond + 1)) + minCond;
        currentCondition = weatherConditions[randNum];
    }

    // Method to randomly generate temperature
    public void generateTemperature() {
        Random rand = new Random();
        currentTemperature = rand.nextInt((maxTemp - minTemp + 1)) + minTemp;
    }

    // Getter methods
    public String getCurrentCondition() {
        return currentCondition;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
