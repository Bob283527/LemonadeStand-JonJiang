import java.util.Scanner;

public class LemonadeStand {
	
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

