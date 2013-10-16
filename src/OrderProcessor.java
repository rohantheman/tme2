/*Design and implement a class called OrderProcessor. You must implement at least the following methods:
accept; // this method accepts a GenericOrder or any of its subclass objects and stores it in any internal collection of OrderProcessor.
process; // this method sorts all accepted orders in the internal collection of GenericOrder into collections of ComputerPart, Peripheral, Cheese, Fruit, and Service. You must associate each object with the unique identifier. You may refer to the TwoTuple.java example in the text book.
dispatchXXX; // this method simulates the dispatch of the sorted collections. For example, the method dispatchComputerParts() should produce this output:
Motherboard ¬ñ name=Asus, price=$37.5, order number=12345
Motherboard ¬ñ name=Asus, price=$37.5, order number=987654
RAM ¬ñ name=Kingston, size=512, price=$25.0, order number=123456
You may overload each of the above methods as you think necessary.*/

import java.lang.reflect.Field;
import java.util.*;

public class OrderProcessor {
	List<GenericOrder> listOfOrders = new ArrayList<GenericOrder>();

	public void accept(GenericOrder genericOrder) {
		listOfOrders.add(genericOrder);
	}; // this method accepts a GenericOrder or any of its subclass objects and
		// stores it in any internal collection of OrderProcessor.

	public void process() {
		Collections.sort(listOfOrders);
		System.out.println();
	}; // this method sorts all accepted orders in the internal collection of
		// GenericOrder into collections of ComputerPart, Peripheral, Cheese,
		// Fruit, and Service. You must associate each object with the unique
		// identifier. You may refer to the TwoTuple.java example in the text
		// book.

	public void dispatchComputerParts() {
		for (GenericOrder order : listOfOrders) {
			if ((order instanceof ComputerOrder))
				System.out.print(order.getClass() + "\t");
		}

	}; // this method simulates the dispatch of the sorted collections. For
		// example, the method dispatchComputerParts() should produce this
		// output:

	public void dispatchXXX() throws IllegalArgumentException, IllegalAccessException{

		for (GenericOrder order : listOfOrders) {

			for (Product product : order.listOfProducts) {
				System.out.print(product.getClass().getSimpleName() + "\t");
				Field instanceFields[] = product.getClass().getDeclaredFields();
				for (Field field : instanceFields) {
					field.setAccessible(true);
					System.out.print(field.getName() + "=" + "\t");
					Object value = field.get(field);
					System.out.println(value);
					
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	// this method simulates the dispatch of the sorted collections. For
	// example, the method dispatchComputerParts() should produce this
	// output:
//	Motherboard     name=Asus, price=$37.5, order number=123456
//	Motherboard     name=Asus, price=$37.5, order number=987654
//	RAM name=Kingston, size=512, price=$25.0, order number=123456

}
