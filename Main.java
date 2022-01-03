// This class has the main method which runs the program

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Main implements Serializable {

	//ArrayLists to store Dog and Cat instances to serialize 
	private ArrayList<Dog> readArray = new ArrayList();
	private ArrayList<Dog> dataDog = new ArrayList();

	private ArrayList<Cat> readArray1 = new ArrayList();
	@SuppressWarnings("unchecked")
	private ArrayList<Cat> dataCat = new ArrayList();

	// Creates Cat and Dog instances and writes them to binary files to derserialize later
	public void createInitialPets() {

		Dog d = new Dog("mahDog");
	
		this.readArray.add(d);

		Cat c = new Cat("mahCat");
	

		this.readArray1.add(c);

		this.initialSerialize();
		
	}
	
	//First object serialization
	@SuppressWarnings("resource")
	public void initialSerialize() {

		try {
			
			FileOutputStream file_os = new FileOutputStream("dogList1.ser");

			ObjectOutputStream obj_os = new ObjectOutputStream(file_os);

			obj_os.writeObject(this.readArray);

			file_os.close();
			obj_os.close();

			FileOutputStream file_os2 = new FileOutputStream("catList1.ser");

			ObjectOutputStream obj_os2 = new ObjectOutputStream(file_os2);

			obj_os2.writeObject(this.readArray1);

			file_os2.close();
			obj_os2.close();

		} catch (FileNotFoundException f) {
			System.out.println("Error: FileNotFoundEx - serialize method");
			return;
		}

		catch (IOException e) {
			System.out.println("Error: Ioex - serialize method");
			e.printStackTrace();
			return;
		}
	}


	//Serialize method
	@SuppressWarnings("resource")
	public void serialize() {

		try {
			
			FileOutputStream file_os = new FileOutputStream("dogList1.ser");

			ObjectOutputStream obj_os = new ObjectOutputStream(file_os);

			obj_os.writeObject(this.dataDog);

			file_os.close();
			obj_os.close();

			FileOutputStream file_os2 = new FileOutputStream("catList1.ser");

			ObjectOutputStream obj_os2 = new ObjectOutputStream(file_os2);

			obj_os2.writeObject(this.dataCat);

			file_os2.close();
			obj_os2.close();

		} catch (FileNotFoundException f) {
			System.out.println("Error: FileNotFoundEx - serialize method");
			return;
		}

		catch (IOException e) {
			System.out.println("Error: Ioex - serialize method");
			e.printStackTrace();
			return;
		}
	}

	//deserialize method
	@SuppressWarnings("unchecked")
	public void deserialize() {
		
		try {
			FileInputStream file_is = new FileInputStream("dogList1.ser");

			ObjectInputStream obj_is = new ObjectInputStream(file_is);

			this.dataDog = (ArrayList<Dog>) obj_is.readObject();

			file_is.close();
			obj_is.close();

			FileInputStream file_is2 = new FileInputStream("catList1.ser");

			ObjectInputStream obj_is2 = new ObjectInputStream(file_is2);

			this.dataCat = (ArrayList<Cat>) obj_is2.readObject();

			file_is2.close();
			obj_is2.close();

		} catch (IOException e) {
			System.out.println("Error: IOex - deserialize method");
			return;
		} catch (ClassNotFoundException c) {

			System.out.println("Error: ClassNotFound Ex - deserialize method");
			return;
		}

	}

	//this method shows the menu to the user to choose the pet
	public void menu() {

		Scanner read = new Scanner(System.in);
		int input;

		boolean keepGoing = true;

		while (keepGoing) {
			
			System.out.println("1. Dog");
			System.out.println("2. Cat");
			System.out.println("3. Exit");

			System.out.println("Enter number to choose the pet or 3 to exit");
			input = read.nextInt();

			if (input == 1) {

				for (Dog a : this.dataDog) {

					System.out.printf("This is dog %s\n", a.getName());
					a.menu();
					
				}
							
			} else if (input == 2) {

				for (Cat b : this.dataCat) {

					System.out.printf("This is cat %s\n", b.getName());
					b.menu();

				}

			} else if (input == 3) {
				System.out.println("3. Exiting...");
				keepGoing = false;
			}

			else {

				System.out.println("Enter valid input");
			}

		}

		read.close();
	}

	//This method increases the age of the pets
	public void updateTime() {

		for (Dog a : this.dataDog) {

			a.updateTime();
		}

		for (Cat b : this.dataCat) {

			b.updateTime();
		}
	}

	//Starts the program
	public void start() {

		//this.createInitialPets();
		

		this.deserialize();
		  
		this.menu();
		  
	 	this.updateTime();
		  
		this.serialize();
		 
	}
	

	public static void main(String[] args) {

		Main pets = new Main();
		pets.start();

	}

}

