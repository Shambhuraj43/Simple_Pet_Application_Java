import java.io.Serializable;

public class Happiness extends Attributes {

	private float hpValue;
	
	Happiness(){
		this.hpValue = getValue();
	}
	
	//getter for the value
	public float gethpValue() {
		
		return this.hpValue;
	}
	
	//gives user the status of the attribute	
	public void getStatus() {
		
		System.out.printf("Happiness value: %.2f\n", this.value);
		
		if(this.value < -1) {
			
			
			System.out.println("The pet is sad");
		}
		else {
			
			System.out.println("The pet is happy.");
		}
	}
	
	//returns boolean if the attribute value is out of the range
	public boolean isValue() {
		
		if(this.hpValue < -1) {
			return false;
		}
		else {
			
			return true;
		}
	}

}

