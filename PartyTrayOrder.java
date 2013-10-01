/*Design and implement a subclass of GenericOrder called PartyTrayOrder that takes an arbitrary number of 
 * different classes of Cheese objects, Fruit objects, and Service objects. 
 * Implement as many methods as necessary.
*/
package tme2.part1;

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
  
  public void addProduct(Product p) {
	listOfProducts.add(p);
  }

  public String toString() {

	return ("Party Tray Order ID#: " + Integer.toString(uniqueID)
		+ " has the following orders: " + listOfProducts.toString());

  }
  
}
