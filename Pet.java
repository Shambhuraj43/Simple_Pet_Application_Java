//The abstract Pet class

import java.io.Serializable;
import java.util.*;

public abstract class Pet  implements Serializable  {
	

		//Attributes as the characteristics of the pet
		protected Hunger hunger = new Hunger();
		protected Happiness happiness = new Happiness();
		protected Sleep sleep = new Sleep();
		protected int age;
		
		//Constructor
		Pet(){
			
			this.age = 0;
		}
		
		protected String name;
		

		//Prints the menu
		public void printMenu() {
			
			System.out.println("Enter the number for the corresponding option");
			System.out.println("1. Feed");
			System.out.println("2. Sleep");
			System.out.println("3. Play");
			System.out.println("4. Bath");
			System.out.println("5. Walk");
			System.out.println("6. Rename the pet");
			System.out.println("7. Check the age");
			System.out.println("8. Check status of the pet");
			System.out.println("9. Exit");
			
		}
		
		//This method is defines in the specific child classes
		abstract public void menu();
		
		//to feed the pet
		public void feed() {
			
			this.hunger.increaseValue();
		}
		
		//sleep method
		public void sleep() {
			
			this.sleep.increaseValue();
		}
		
		//play method which changes the happiness value
		public void play() {
			
			this.happiness.increaseValue();
		}
		
		//walk method
		public void walk() {
			
			this.happiness.increaseValue();
		}
		
		//this method is defined in the child classes
		abstract public void bath();

		public String rename() {
			
			Scanner read = new Scanner(System.in);
			
			System.out.println("Enter the name");
			
			String readString = read.next();
			
			return readString;
			
			
		}
			
		//getter for the age of the pet
		public int age() {
			
			return this.age;
		}
		
		//Changes attribute values just before the program ends
		public void updateTime(){
			
			this.age  = this.age + 1;
			this.sleep.increaseValue();
			this.happiness.increaseValue();
			this.hunger.decreaseValue();
		}
		
		public void checkStatus() {
			
			hunger.getStatus();
			sleep.getStatus();
			happiness.getStatus();
			
		}
		
		
}


