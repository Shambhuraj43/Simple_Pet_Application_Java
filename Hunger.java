//Hunger Attribute

import java.util.*;


public class Hunger extends Attributes {

	private float hungerValue;
	
	Hunger(){
		
		this.hungerValue = getValue();;
	}
	
	
	public float gethValue() {
		
		return this.hungerValue;
	}
	
	//Gives the user status of the attribute
	public void getStatus() {
		
		System.out.printf("Hunger value: %.2f\n", this.hungerValue);
		
		if(this.hungerValue < -1) {
			System.out.println("The pet is dead due to starving!");
		}
		else if(this.hungerValue > 1) {
			System.out.println("The pet is full and cannot eat anything.");
		}
		else {
			System.out.println("The pet can be fed.");
		}
	}
	
	@Override
	 public void increaseValue() {
		
		if(this.hungerValue > 1) {
			System.out.println("The pet is full and cannot eat anything.");
		}
		else {
			
			this.hungerValue = this.hungerValue + 0.4f;
		}
		
	}

	//After the program ends, this method decreases the attribute value
	public void updateTime() {
		decreaseValue();
	}
	
	// returns boolean to check if the value is out of the range
	public boolean isValue() {
		
		if(this.hungerValue < -1) {
			return false;
		}
		else {
			
			return true;
		}
	}
}

