import java.util.Random;

public class Customer {

    private double favorability;
    private final int minFav = 0;
    private final int maxFav = 50;

    // Placeholder values
    private double price;
    private double cash;

    // Determine how favorable the customer finds your lemonade
    public void calculateFavorability(String weather, int temperature, double price, int recipeQuality) {
        // Dummy logic: favorability depends on weather and recipe quality
        favorability = 50;

        if (weather.equals("Sunny")) {
            favorability += 10;
        } else if (weather.equals("Rainy")) {
            favorability -= 15;
        }

        favorability += (recipeQuality * 0.5);
        favorability -= price;

        // a fav number between 0 and 100
        favorability = Math.max(0, Math.min(favorability, 100));
    }

    // Decide to buy or not
    public boolean decideToBuy() {
        if (favorability >= 70) {
            Random rand = new Random();
            int randFavNum = rand.nextInt((maxFav - minFav + 1)) + minFav;
            return randFavNum >= 25;
        }
        return false;
    }
}


