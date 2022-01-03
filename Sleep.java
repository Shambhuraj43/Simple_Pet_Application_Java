
public class Sleep extends Attributes {

	//Sleep value
	private float sValue;
	
	Sleep(){
		
		this.sValue = getValue();
	}
	
	public float getsValue() {
		
		return this.sValue;
	}
	
	//gives user the status of the attribute
	public void getStatus() {
		
		System.out.printf("Sleep value: %.2f\n", value);
		
		if(value < -1) {
			
			System.out.println("The pet needs to rest.");
		}
	}
	
	public boolean isValue() {
		
		if(this.sValue < -1) {
			return false;
		}
		else {
			
			return true;
		}
	}
}

