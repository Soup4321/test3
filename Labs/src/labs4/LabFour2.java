package labs4;

//The squirrels in Palo Alto spend most of the day playing. In particular, they 
//play if the temperature is between 60 and 90 (inclusive). Unless it is summer, 
//then the upper limit is 100 instead of 90. Given an int temperature and a 
//boolean isSummer, return true if the squirrels play and false otherwise.
//Test casessquirrelPlay(70, false) -> truesquirrelPlay(95, false) -> falsesquirrelPlay(95, true) -> true
public class LabFour2 {

	public static void main(String[] args) {
		// declare the variables
		int outsideTemp = 70;
		boolean isPlaying = true;

		int upperTemp = maxTemp(isPlaying);

		if (outsideTemp >= 60 && outsideTemp <= upperTemp) {
			System.out.println("The squirrels play");
		} else {
			System.out.println("The squirrels do not play");
		}

	}

	public static int maxTemp(boolean isSummer) {
		int maxTemp = 0;

		if (isSummer == true) {
			maxTemp = 100;
		} else {
			maxTemp = 90;
		}
		return maxTemp;
	}

}
