import java.util.Scanner;

public class LemonadeStand {

    // Inventory quantities
    private static int iceInv = 0;
    private static int lemonInv = 0;
    private static int cupInv = 0;
    private static int sugarInv = 0;

    // Recipe & pricing
    private static int recipeQuality;
    private static double pricePerCup;

    // Prices
    private static final double icePrice = 0.50;
    private static final double lemonPrice = 1.50;
    private static final double cupPrice = 1.00;
    private static final double sugarPrice = 1.50;

    // Cash on hand
    private static double cash = 20.00; // Starting cash

    }

    public static void buySupplies(Scanner scanner) {
        // ICE
        System.out.print("How many units of ice would you like to buy? ($0.50 each): ");
        int iceToBuy = scanner.nextInt();
        double iceCost = iceToBuy * icePrice;

        // LEMONS
        System.out.print("How many lemons would you like to buy? ($1.50 each): ");
        int lemonsToBuy = scanner.nextInt();
        double lemonCost = lemonsToBuy * lemonPrice;

        // CUPS
        System.out.print("How many cups would you like to buy? ($1.00 each): ");
        int cupsToBuy = scanner.nextInt();
        double cupCost = cupsToBuy * cupPrice;

        // SUGAR
        System.out.print("How many units of sugar would you like to buy? ($1.50 each): ");
        int sugarToBuy = scanner.nextInt();
        double sugarCost = sugarToBuy * sugarPrice;

        // Total cost
        double totalCost = iceCost + lemonCost + cupCost + sugarCost;

        // Check for sufficient cash, will do later
        
        }

        // might be right?? who knows
        cash -= totalCost;
        iceInventory += iceToBuy;
        lemonInventory += lemonsToBuy;
        cupInventory += cupsToBuy;
        sugarInventory += sugarToBuy;
    }

    public static void setRecipe(Scanner scanner) {
        System.out.print("Enter how much ice (in cubes) you want in the recipe: ");
        int ice = scanner.nextInt();

        System.out.print("Enter how many lemons you want in the recipe: ");
        int lemons = scanner.nextInt();

        System.out.print("Enter how many cups you want in the recipe: ");
        int cups = scanner.nextInt();

        System.out.print("Enter how much sugar (in tablespoons): ");
        int sugar = scanner.nextInt();
//idk wht to make formula jus placehoilder for now
        recipeQuality = ice + lemons + cups + sugar;

        System.out.println("Recipe quality score: " + recipeQuality);
    }

    public static void setPrice(Scanner scanner) {
        System.out.print("Set the price of your lemonade per cup: ");
        pricePerCup = scanner.nextDouble();

    }

    public static void getWeather() {
       //idk how to start this
    }
}
