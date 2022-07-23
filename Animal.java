package proj2sp22;
/**
 * <p>Title: The Animal Class</p>
 *
 * <p>Description: This class holds instance variables to initialize the gender of the animals 
 * as well as initializing their strength. It can determine whether two animals are able to mate or
 *fight along with different accessor method definitions to retrieve specifics about a certain animal</p>
 *@author Roni Mikhaylov
 * 
 */
public class Animal {

	private boolean gender;
	private double strength;
	/**
	 * default constructor
	 * randomly determines the gender and strength of the animal
	 * strength is on the scale from 0-100
	 */
	public Animal() {

		if((int)(Math.random() * 2)== 0 ) {
			//male is true; female is false
			gender = true;
		}
		strength = (Math.random() * 101);
	}

	/**
	 * sees whether both animals are of the same class type and different gender to determine whether they can mate
	 * @param a
	 * @return true if they can mate, false otherwise
	 */
	public boolean canMate(Animal a) {
		// if the genders are not equal, then they can mate.
		//Classes have to be the same and genders have to be different
		return (getClass().equals(a.getClass()))&&(gender !=(a.gender));
	}

	/**
	 * accessor method to return gender of the animal
	 * @return Male if gender is true, Female otherwise
	 */

	public String getGender(){
		if (gender)
			return "Male";
		else
			return "Female";
	}


	/**
	 * accessor method to get the strength of the animal
	 * @return strength
	 */
	public double getStrength() {
		return strength;
	}


	/**
	 * if the strengths are the same, a random winner is chosen  
	 * @param Animal contains the animal being fought
	 * @return the winner of a fight between 2 animals based on the strength
	 * @throws IllegalArgumentException if the class or gender of the animal do not match this animal's class and gender
	 */
	public Animal fight(Animal a) {
		// if they cant fight we throw an exception
		// if the classes are different or the genders are different then they cannot fight
		if ((!getClass().equals(a.getClass())|| !getGender().equals(a.getGender()))) {
			throw new IllegalArgumentException("These Two Animals Cannot Fight");
			// if they can fight the stronger one wins unless there is a tie..
			// which will lead to a coin flip
			// comparing the strength
		}if (strength > a.strength) {
			return this;
		}else if (strength <  a.strength) {
			return a;
		}else if((int)(Math.random() * 2)== 0 ) {
			return this;
		}else {
			return a;
		}
	}

	/**
	 * increases the animal's strength by amount.
	 * if the additional strength exceeds 100, the total strength becomes 100 (we never exceed 100)
	 * @param amount
	 */
	public void increaseStrength(double amount) {
		if (strength + amount < 100) {
			strength += amount;
		}
		else {
			strength = 100;
		}
	}
	/**
	 * toString method for the Animal 
	 * displays the state of the Animal
	 * @return String str 
	 */
	public String toString() {
		String str = new String();
		str = getGender() + getClass() + "(Strength " + strength + ")";
		return str;	
	}

}
