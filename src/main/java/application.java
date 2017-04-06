import java.util.ArrayList;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		// define the food items into an array for strings
		String[] foodItems = new String[] {"Cola", "Hot Chocolate", "Cheese Sandwich", "Hot dog"};
		// define the price of the food in a array of double
		Double[] priceItems = new Double[] {0.5, 1.20, 1.50, 2.30};
		
		ArrayList<Double> runningCount = new ArrayList<Double>();	
		Boolean active = true;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		while(active){

			System.out.println("Enter a number between 0 and 3: ");
			//Read in a string
			String n = reader.nextLine().trim();

			//Try catches are around areas where you expect it has a problem
			try{
				//Convert a string to an int (throwns an exception if it doesn't work
				int m = Integer.parseInt(n);
				if(m < foodItems.length) {
					System.out.printf("%s : %.2f%n",foodItems[m],priceItems[m]);
					runningCount.add((double) m);
					//System.out.println(runningCount);
				}	
				//Do the code you've written so far here
				}catch (Exception ex) {
					switch(n.toLowerCase()){
					   case "exit":
					   case "quit":
					       active = false;
					    break;
					   	case "total":
						   //List current total here
					   		Double total = 0d;
					   		Double iterator = 0d;
						   for (int j=0; j < runningCount.size(); j++){	   
							iterator = runningCount[j];
							total += priceItems[iterator];
						   }
						   System.out.printf("£%.2f%n",total);
					     
				}
			}	
		}
	}
}
