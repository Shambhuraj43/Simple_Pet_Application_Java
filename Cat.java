//Cat class derived from the Pet class

import java.io.Serializable;
import java.util.*;


public class Cat extends Pet  implements Serializable  {

		//default constructor
		Cat(){
			
			name = "cat";
		}

		//Overloaded constructor
		Cat(String nameGiven){
			
			this.name = nameGiven;
		}
		
		//abstract method definition	
		public void bath() {
			
			happiness.decreaseValue();
		}
		
	
	public String getName() {
		
		return name;
	}
	
	//menu to be showed to the user
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
				
				int ageCat = age();
				
				System.out.printf("The age of your Cat is %d\n", ageCat);
	
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


