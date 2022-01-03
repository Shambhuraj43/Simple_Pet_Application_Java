run: Main.class
	java Main

default: Main.class
	
Main.class: Main.java Dog.class Cat.class 
	javac Main.java

Dog.class: Dog.java Pet.class
	javac Dog.java

Cat.class: Cat.java Pet.class
	javac Cat.java

Pet.class: Pet.java Hunger.class Happiness.class Sleep.class
	javac Pet.java

Hunger.class: Hunger.java Attributes.class 
	javac Hunger.java

Happiness.class: Happiness.java Attributes.class	
	javac Happiness.java

Sleep.class: Sleep.java Attributes.class
	javac Sleep.java

Attributes.class: Attributes.java 
	javac Attributes.java

clean: 
	rm *.class

