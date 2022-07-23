package proj2sp22;
/**
 * <p>Title: The Fish Class</p>
 *
 * <p>Description: This class holds a constructor to initialize a fish object as well as a toString to print the 
 * state of the Bear</p>
 *@author Roni Mikhaylov
 * 
 */
public class Fish extends Animal {

	/**
	 * default Fish constructor
	 * calls the parent constructor to initialize the animal object
	 */
	public Fish() {
		super();
	}
	/**
	 * toString method --
	 * @return String str, the State of the Fish object
	 */
	public String toString() {
		String str = new String();

		str = getGender() + " Fish (Strength " + String.format("%.1f",getStrength()) + ") " ;
		return str;
	}
}

