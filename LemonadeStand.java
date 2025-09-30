import java.util.Scanner;

public class LemonadeStand {
<<<<<<< HEAD
	
	public static void main (String[] args) {
		//vars
		int recipe;
		double cash;
		double icePrice = 0.50;
		double lemonPrice = 1.50;
		double cupPrice = 1.00;
		double sugarPrice = 1.50;
		
		String[] inventory = {"ice", "lemon", "cup", "sugar"};
		
		
		//meths fr
		
		public runDay() {
			Scanner dayAmt = new Scanner(System.in);
			System.out.println("Please type how many days: \n10\n20\n30");
			/*Gonafigure out how to make this later like how to pass time in game maybe add a clock variable or method for every ms 1 second goes by
			Dunno how im gona do it for now */
		}
		public setRecipe(inventory) {
			Scanner iceAmt = new Scanner(System.in);
			System.out.println("Please enter how much ice you want in the recipe:");
			Scanner lemonAmt = new Scanner(System.in);
			System.out.println("Please enter how much lemons you want in the recipe:");
			Scanner cupAmt = new Scanner(System.in);
			System.out.println("Please enter how much cups you want in the recipe:");
			Scanner sugarAmt = new Scanner(System.in);
			System.out.println("Please enter how much suagr you want in the recipe:");
			recipe = (iceAmt + lemonAmt + cupAmt + sugarAmT);
			//Not finished yet with recipe work in progress cuz idk wht to do for formula
	}
		
		public setPrice() {
			Scanner price = new Scanner(System.in);
			System.out.println("Set the price of your cups");
		}
		public getWeather() {
			//making weather class and see if i can call it here(idk how)
		}
		public buySupplies(cash) {
			double totPrice = ( (icePrice*iceAmt) + (lemonPrice*lemonAmt) + (cupPrice*cupAmt) + (sugarPrice*sugarAmt) );
			double finalCash = (cash-totPrice); 
			cash = finalCash;
		}
		
}
=======
>>>>>>> 37da73bd3fffe694f843956c14d6c5e63a9814e5

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
