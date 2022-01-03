//The abstract class for the attributes class

import java.io.Serializable;


public abstract class Attributes implements Serializable  {
	
		//This variable tracks the attribute's value	
		protected float value;
		
		Attributes(){
			
			this.value = 0.5f;
		}
		
		//getter for the value
		public float getValue() {
			
			return this.value;
		}

		//Increases the value of the attribute		
		public void increaseValue() {
			
			this.value = this.value + 0.3f;
			
		}
		
		//decreases the value of the specific attribute
		public void decreaseValue() {
			
			this.value = this.value - 0.2f;
			
		}
		
		//These methods are defined in the specific attribute 		
		abstract public boolean isValue();
		abstract public void getStatus();
		
}

