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
        int randNum = (int)(Math.random() * weatherConditions.length); //found this on w3 Schools the .length thing
        currentCondition = weatherConditions[randNum];
    }

    // random weather gen
    public void generateTemperature() {
        Random rand = new Random();
        currentTemperature = (int)(Math.random() * (maxTemp - minTemp + 1)) + minTemp;
    }

    // checking to see if it was working ysknow
    public String getCurrentCondition() {
        return currentCondition;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
