public class Weather {
	
	public static void main (String[] args) {
		//Instance
		
		//for weather, may make bigger depending on if i add more weather conditions 
		int min = 0;
		int max = 3;
		//for temp, might make bigger or smaller later
		int min2 = 0;
		int max2 = 100;
		
		//Attributes
		String[] weatherConditions = {"Sunny", "Rainy", "Cloudy", "Hazy"};
		
		
		
		//methods
		public randWeather(weatherConditions) {
			//randomly decides what weather to give using the Weather/Condition array
			int randNum = (int)(Math.random() * (max - min + 1)) + min;
			finalWeather = weatherConditions[randNum];
		}
		public randTemp() {
			//Random Temperature made
			int randTemp = (int)(Math.random() * (max2 - min2 + 1)) + min2;

		}
	}
}

