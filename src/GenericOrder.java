/*Design a generic container called GenericOrder that acts as a collection of an arbitrary number of objects in Products.java. 
 * Design a mechanism that gives each instance of the container a unique identifier. 
Implement as many methods as necessary. You must use Java generics features.*/

import java.util.ArrayList;
import java.util.Collection;

public class GenericOrder implements Comparable<GenericOrder> {

	static int uniqueID = 0;
	String instanceName;
	int instanceID;

	public static int createUniqueID() {
		if (uniqueID == 0) {
			uniqueID = 1001;
		} else {
			uniqueID += 1;
		}
		return uniqueID;
	}

	Collection<Product> listOfProducts = new ArrayList<Product>();

	public GenericOrder() {
		createUniqueID();
		instanceID = getUniqueID();
		instanceName = this.getClass().getSimpleName();
	}

	public static int getUniqueID() {
		return uniqueID;
	}


	public static void setUniqueID(int uniqueID) {
		GenericOrder.uniqueID = uniqueID;
	}


	public void getListContents() {
		for (Product p : listOfProducts) {
			System.out.print(p.getClass().getSimpleName() + "\t");
		}
	}

	public void addProduct(Product p) {
		listOfProducts.add(p);
	}

	public String toString() {
		return ("Generic Order ID#: " + Integer.toString(uniqueID)
				+ " has the following orders: " + listOfProducts.toString());
	}


	@Override
	public int compareTo(GenericOrder order) {
		int nameValue = instanceName.compareToIgnoreCase(order.instanceName);
		if(nameValue != 0){
			return nameValue;
		}
		return instanceID - order.instanceID;
	}

}
