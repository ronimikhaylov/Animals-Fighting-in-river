package proj2sp22;

import javax.swing.JOptionPane;
/**
 * <p>Title: The Application Class</p>
 *
 * <p>Description: This class ask a the user to create a river with a size of 10-30. Then animals are generated using 
 * the river and animal class to fill the river halfway of whatever the user inputed. This application also contains methods
 * which start the process of the animals fighting, mating, eating and moving. The animals will be moving, fighting, eating or mating 
 * until the river is full or until there is only one loner animal left in the river.  </p>
 *@author Roni Mikhaylov
 * 
 */
public class Proj2App {
	public static void main (String [] args) {
		int size = 0;
		// asking the user 3 times at most for a number between 10 and 30 and if they fail to do it correctly 
		// the program quits
		for(int i = 0; i< 3; i++) {
			String answer = 
					JOptionPane.showInputDialog("Plese Enter a number between 10 and 30  inclusively for the size of the river");
			try {
				size = Integer.parseInt(answer);
				if (size >= 10 && size <=30) {
					break;
				}
				JOptionPane.showMessageDialog(null, "Plese Enter a number between 10 and 30  inclusively for the size of the river");		
			}

			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Plese Enter a number between 10 and 30  inclusively for the size of the river");		
			}



		}
		// instantiating a river object and initializing it to null
		River river = null;


		// try catch block to catch illegal size given by user 
		try {
			river =new River(size);
		}
		catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());	
			return;
		}
		System.out.println("Initial River State:\n");
		System.out.println(river);
		System.out.println("Now the Animals are restless");

		int countOfAnimals = river.getNumAnimals();
		int numPass = 1;

		// continuing the simulation until there is only one animal left or if the river is full

		while(countOfAnimals > 1 && countOfAnimals < size) {

			System.out.println("Simulation Pass: " + numPass);
			// iterate each position in the river
			for (int j = 0; j<size; j++) {
				Animal animal = river.getAnimal(j);
				if(animal == null) {
					System.out.println("Cell " + j + " is empty, no changes occur.");
				}else {
					//  determines what happens when we move an animal
					try {
						river.moveAnimal(j);
						System.out.println(river + "\n");
					}
					catch (IllegalStateException e) {
						System.out.println(e.getMessage());	
						return;

					}
				}
			}

			numPass++;
			countOfAnimals = river.getNumAnimals();
		}


	}
}
