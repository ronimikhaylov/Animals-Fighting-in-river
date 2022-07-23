package proj2sp22;
/**
 * <p>Title: The Bear Class</p>
 *
 * <p>Description: This class holds a constructor to initialize a bear object as well as a toString to print the 
 * state of the Bear</p>
 *@author Roni Mikhaylov
 * 
 */
public class Bear extends Animal {


	/**
	 * default Bear constructor
	 * calls the parent constructor to initialize the animal object
	 */
	public Bear() {
		super();

	}
	/**
	 * toString method --
	 * @return String str, the State of the Bear object
	 */
	public String toString() {
		String str = new String();
		// parent class shouldnt have any knowldege of the subclasses

		str = getGender() + " Bear (Strength " + String.format("%.1f",getStrength()) + ") ";
		return str;
	}

}
