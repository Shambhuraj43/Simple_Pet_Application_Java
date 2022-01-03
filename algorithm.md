#### Goal: 
1. Create an object of Main class
2. Run Atm method **start()** to start the pet program
#### Input: 
-- User input is required as per the choices
#### Output:
-- Output will be shown as per the choices
***
***
# Main Class:
#### Goal: 
1. Start the program with which user will be interacting
2. Have a method **start()** to start the atm program
#### Input: 
-- User input is required as per the choices
#### Output:
-- Output will be shown as per the choices
#### Methods:
##### 1.start():void
* Run the atm program using class methods
##### 2. serialize()
* Using deserialization, store the user objects in the array list
##### 2. deserialize()
* Using serialization, write the user array list to the external file
* delete the array list
##### 3. menu()
* Displays the menu for the user
##### 4. createInitialPets()
*Using initialSerialization() method, create binary file for the Cat and Dog objects
##### 5. updateTime()
* updates time which changes attributes values
##### 6. main()
* runs the start() method

***
***
# Dog class:
#### Goal: 
1. To create a virtual dog for the user to interact with
#### Input: 
-- User input is required as per the choices
#### Output:
-- Output will be shown as per the choices
#### Methods:
##### 1.bath():void
* changes the attribute value
##### 2.getName():String
* returns the name of the pet
##### 3.menu():void
* Displays various options for interaction

# Cat class:
#### Goal: 
1. To create a virtual cat for the user to interact with
#### Input: 
-- User input is required as per the choices
#### Output:
-- Output will be shown as per the choices
#### Methods:
##### 1.bath():void
* changes the attribute value
##### 2.getName():String
* returns the name of the pet
##### 3.menu():void
* Displays various options for interaction

***
***
# Pet Class (Abstract):
#### Goal: 
1. This is an abstract class for the pets. The Dog and the Cat class inherit this class whcih have a few methods defines and two abstract methods.

#### Input: 
-- User input is required as per the choices
#### Output:
-- Output will be shown as per the choices
#### Methods:
##### 1.printMenu():void
* Display the menu of 9 different options
* Take an input from the user and call the respective method
* End the loop until user enteres **9** to exit
##### 2.menu(): void
* Calls printMenu() method and takes user input to call other methods
##### 2.checkStatus: void
* Shows the value of 3 attributes
***
***

# Attributes: abstract void 
#### Goal: 
1. This class will be an abstract class.
2. There are three attributes Hunger, Sleep, and Happiness which will be characteristics of the pet. 
3. These three classes will inherit the abstract class. There are some abstract methods in the class.
#### Input: 
-- None
#### Output:
-- None
#### Methods:
##### 1.getValue():void
##### 2.increaseValue():abstract void
##### 3.decreaseValue:void
##### 4.isValue(): void
##### 5.getStatus(): void

***
***

# Hunger Class extends Attributes class: void 
#### Goal: 
1. This class overwrites the methods of Attributes class.
#### Input: 
-- None
#### Output:
-- None
#### Methods:
##### 1.getValue():void
* return the value for the attribute
##### 2.getStatus:void
* shows the status of the attribute
##### 3.increasevalue():void
* Increases the value of the attribute
##### 4.isValue:void
* returns a boolean value 
***
***

# Happiness Class extends Attributes class: void 
#### Goal: 
1. This class overwrites the methods of Attributes class.
#### Input: 
-- None
#### Output:
-- None
#### Methods:
##### 1.getValue():void
* return the value for the attribute
##### 2.getStatus:void
* shows the status of the attribute
##### 3.increasevalue():void
* Increases the value of the attribute
##### 4.isValue:void
* returns a boolean value 
***
***

# Sleep Class extends Attributes class: void 
#### Goal: 
1. This class overwrites the methods of Attributes class.
#### Input: 
-- None
#### Output:
-- None
#### Methods:
##### 1.getValue():void
* return the value for the attribute
##### 2.getStatus:void
* shows the status of the attribute
##### 3.increasevalue():void
* Increases the value of the attribute
##### 4.isValue:void
* returns a boolean value 
***
***





