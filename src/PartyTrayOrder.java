/*Design and implement a subclass of GenericOrder called PartyTrayOrder that takes an arbitrary number of 
 * different classes of Cheese objects, Fruit objects, and Service objects. 
 * Implement as many methods as necessary.
*/


public class PartyTrayOrder extends GenericOrder<Product> {
    static int uniqueID = 0;
    
    public static int createUniqueID() {
	if (uniqueID == 0) {
	    uniqueID = 3001;
	} else {
	    uniqueID += 1;
	}
	return uniqueID;

    }
    
  public PartyTrayOrder() {
      createUniqueID();
  }
  
  public void addProduct(Product aProduct) throws ClassCastException {
    	if(!((aProduct instanceof Cheese)||(aProduct instanceof Fruit)||(aProduct instanceof Service)))
    	throw new ClassCastException("Not a ComputerPart, Peripheral, or Service object");
    	else{
	listOfProducts.add(aProduct);
    	}
    }

  public String toString() {

	return ("Party Tray Order ID#: " + Integer.toString(uniqueID)
		+ " has the following orders: " + listOfProducts.toString());

  }
  
}
