
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {


		System.out.println("\n ------------------------------------");
		System.out.println(" ---RANDOM-GENERATOR-FOOD-SCHEDULE---");
		System.out.println(" ------------------------------------");
		
		String[] mat = {"Pasta och kottbullar", "Fisk",  "Pizza", "Korv", "Spagetti", "Tacos", "Hamburgare"};
	 
		String[] veckodagar = {"Monday: ", "Tuesday: ", "Wednesday: ", "Thursday: ", "Friday: ", "Saturday: ", "Sunday: "};
		
    // tids delay
		Thread.sleep(1000);
		
    // loopen - [7 dagar]
		for (String i : veckodagar) {
    
      // random från mat[listan]
			java.util.Random random = new java.util.Random();
			int randomFood = random.nextInt(mat.length);
			
			
			System.out.println("\n\t" +i + mat[randomFood]);
			
			Thread.sleep(1000);
			
		}
		System.out.println("\n ------------------------------------");
		System.out.println(" ------------------------Samex-Java--");
		System.out.println(" ------------------------------------");
	

	}


}
