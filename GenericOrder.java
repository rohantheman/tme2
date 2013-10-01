/*Design a generic container called GenericOrder that acts as a collection of an arbitrary number of objects in Products.java. 
 * Design a mechanism that gives each instance of the container a unique identifier. 
Implement as many methods as necessary. You must use Java generics features.*/

package tme2.part1;

import java.util.ArrayList;
import java.util.Collection;

public class GenericOrder <T>{

    static int uniqueID = 0;

    public static int createUniqueID() {
	if (uniqueID == 0) {
	    uniqueID = 1001;
	} else {
	    uniqueID += 1;
	}
	return uniqueID;

    }
    
    Collection<T> listOfProducts = new ArrayList<T>();

    public GenericOrder() {
	createUniqueID();
    }
    
    public void getListContents() {
  	for(T p : listOfProducts) {
  	  System.out.print(p.getClass().getSimpleName() + "\t");
  	}
      }
    
    public void addProduct(T p) {
	listOfProducts.add(p);
    }

    public String toString() {
	return ("Generic Order ID#: " + Integer.toString(uniqueID) + " has the following orders: " + listOfProducts.toString()) ;
    }

}