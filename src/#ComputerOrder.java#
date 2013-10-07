/*Design and implement a subclass of GenericOrder called ComputerOrder that takes an arbitrary 
 * number of different classes of ComputerPart objects, Peripheral objects, and Service objects. 
 * Implement as many methods as necessary.
 */


public class ComputerOrder extends GenericOrder<ComputerPart> {

    static int uniqueID = 0;

    public static int createUniqueID() {
	if (uniqueID == 0) {
	    uniqueID = 2001;
	} else {
	    uniqueID += 1;
	}
	return uniqueID;
    }

    public ComputerOrder() {
	createUniqueID();
    }

    public void addProduct(ComputerPart p) {
	listOfProducts.add(p);
    }

    public String toString() {
	return ("Computer Order ID#: " + Integer.toString(uniqueID)
		+ " has the following orders: " + listOfProducts.toString());
    }

}
