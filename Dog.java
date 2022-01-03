//Dog class inheriting the pet class

import java.io.Serializable;
import java.util.*;


public class Dog extends Pet  implements Serializable  {


		Dog(){
			
			name = "dog";
		}
		
		Dog(String nameGiven){
			
			this.name = nameGiven;
		}
		
	
		public void bath() {
			
			happiness.increaseValue();
		}
		
	//getter for the name of the pet
	public String getName() {
		
		return name;
	}
	
	//menu to be showed the user
	public void menu() {
		
		Scanner read = new Scanner(System.in);
		
		boolean keepGoing = true;
		
		while(keepGoing) {
			
			printMenu();
			
			int input = read.nextInt();
			
			if(input == 1) {
				
				feed();
				
			}	
			else if(input == 2) {
				sleep();
				
			}
			else if(input == 3) {
				
				play();
			
			}
			else if(input == 4) {
				
				this.bath();
				
			}
			else if(input == 5) {
				
				walk();
			
			}
			else if(input == 6) {
				
				this.name = rename();

			}
			else if(input == 7){
				
				int ageDog = age();
				
				System.out.printf("The age of your Dog is %d\n", ageDog);
	
			}
			else if(input == 8) {
				checkStatus();
				
			}
			else if(input == 9) {
				
				
				System.out.println("Exiting.......");
				keepGoing = false;
			
			}
			else {
				
				System.out.println("Enter valid input");

			}
			
		}
		
	}
	
	
	
	
}

