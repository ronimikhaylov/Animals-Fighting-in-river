package proj2sp22;
/**
 * <p>Title: The River Class</p>
 *
 * <p>Description: This class holds method definitions that initialize the size of the river (through the users input),
 * determines the right direction to move the animal based on a random number generator and other accessor methods to retrieve specific 
 * information about the river. depending where the animal moves within the river, this class has a lot of control on whether the 
 * bear will eat the fish, mate with a bear of the opposite sex or fight another bear.  </p>
 *@author Roni Mikhaylov
 * 
 */
public class River {
	private Animal [] animals;
	/**
	 * parameterized river constructor
	 * instantiates half the size of the array of animals of random gender and type
	 * places them  randomly in the array
	 * @param size
	 *@throws IllegalArgumentException if the user doesn't input a number 10-30 inclusively
	 */
	public River (int size) {
		if (size<10 || size >30 ) {
			throw new IllegalArgumentException("The size of the river must be 10 - 30 inclusive");
		}animals = new Animal [size];
		int i = 0;
		while (i < size/2) {
			int position = (int)(Math.random() * size);
			if (animals[position] == null) {
				if((int)(Math.random() *2)==0) {
					animals[position] = new Bear();

				}else {
					animals[position] = new Fish();
					//we only increment i if i is an empty position in the array.
				}i++;
			}
		}

	}

	/**
	 * accessor method to get the animal at index x
	 * @param x
	 * @return the Animal at index x or null if no animal is there
	 * 
	 */
	public Animal getAnimal(int x) {
		return animals[x];
	}

	/**
	 * randomly determines if an animal moves forward, backward or stays put.
	 * handles simple moves: mating, fighting and eating.
	 * @param position
	 */
	public void moveAnimal(int position) {
		// random variable assigned to coin flip to give 3 different results, 
		// either the animal will stay put, move backwards, or forwards
		int random = ((int)(Math.random() *3));
		int targetPosition = -1;
		String direction = new String();
		Animal animal = animals[position];
		if(random == 0) {
			// 0 means stay put do not move!
			System.out.println("Cell " + position + "'s " + animal + " stays put.\n");
		}else if (random == 1) {
			// 1 means move backward
			direction = "backward";
			if (position == 0) {
				System.out.println("Cell " + position + "'s " + animal + " stays put.\n");

			}else {
				targetPosition = position - 1;

			}
		} else {
			//moving forward
			direction = "forward";
			if (position == animals.length -1) {
				System.out.println("Cell " + position + "'s " + animal + " stays put.\n");

			}else {
				targetPosition = position + 1;

			}
		}
		// if target position is -1 that means we're staying put
		if (targetPosition == -1) {
			return;
		}

		Animal target = getAnimal(targetPosition);
		// moving with no one next to the animal (no conflict)
		if (target == null) {
			animals[targetPosition] = animal;
			animals[position] = null;
			System.out.println("Cell " + position + "'s " + animal + " goes " + direction + " and settles in its new spot at Cell " + targetPosition + "\n");

		} else {
			// bear eats fish
			if(!animal.getClass().equals(target.getClass()))  {
				// if the animal that moves was a bear, it takes the fishes position 
				if(animal instanceof Bear) {
					animals[targetPosition] = animal;
					System.out.println("Cell " + position + "'s " + animal + " eats " + target + "and settles in its new spot at Cell " + targetPosition + "\n");

				}else {
					System.out.println("Cell " + position + "'s " + animal + " is eaten by  " + target + "\n");

				}
				// the fish disappears (or gets eaten) whether it moves to the bear or the bear moves to it
				animals[position] = null;


				// both animals have to be the same class but not the same gender if they can mate
			}else if(animal.getClass().equals(target.getClass())&& !animal.getGender().equals(target.getGender())){
				Animal baby = null;
				// determines the type of the offspring 
				if (animal instanceof Bear) {
					baby = new Bear();
				}else if (animal instanceof Fish) {
					baby = new Fish();
				} 
				// calls the getNullCell to find an empty cell in the array to put the baby there
				int babyTarget = getNullCell();
				animals [babyTarget] = baby;
				System.out.println("Cell " +  position + "'s " + animal +  " goes " + direction
						+ " ,encounters a " + target
						+ "and together they spawn a new " + baby
						+ "into cell " + babyTarget + " . Elated, they both remain where they are.");
				// determing if two animals can fight. They must be the same class and same gender to fight
			}else if(animal.getClass().equals(target.getClass())&& animal.getGender().equals(target.getGender())){
				//calls the fight method and determines the winner of the fight
				Animal winner = animal.fight(target); 
				// increases the winners strength by 4
				winner.increaseStrength(4.0);
				// what the message should display if the winner was the mover or the mover was the winner
				if(animal == winner) {
					System.out.println(animal + " in cell " + position + " moves " + direction + ", fights and defeats " + target + 
							". And the strength  has been increased by 4.");
					animals[targetPosition] = animal;

				}else {
					System.out.println(animal + " in cell " + position + " moves " + direction + ", fights and defeated by " + target + 
							", whose strength has been increased by 4 due to its victory.");
				}		
				animals[position] = null;

			}else {
				System.out.println("nothing happened");
			}
		}
	}
	/**
	 * accessor method to get the number of animals in the array
	 * @return int count
	 */
	public int getNumAnimals() {
		int count = 0;
		for(int i=0; i<animals.length; i++) {
			if(animals[i] != null) {
				count++;
			}
		} 
		return count;
	}

	/**
	 * accessor method for getting the first null cell for the baby to be placed in an element  
	 * @return int index of the first empty cell
	 * @throws IllegalStateException if there are no empty cells for the baby to be born into. 
	 */

	private int getNullCell() {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				return i;
			}
		}
		throw new IllegalStateException("No More Empty Cells For Any Baby");
	}


	/**
	 * toString method for the river 
	 * displays the state of the river
	 * @return String str 
	 */
	public String toString() {
		String str = new String();
		str = "The size of the river is: " + animals.length;
		for(int i = 0; i<animals.length; i++) {
			str += "\n" + "[" + i+  "]: ";
			if (animals[i] != null) {
				str+= animals[i];

			}
		}
		return str;	
	}
}
