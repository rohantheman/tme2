

class GenericOrderTest {

    public static void main(String xxx[]) {
	GenericOrder<Peripheral> order1 = new GenericOrder<Peripheral>();
	Peripheral monitor = new Monitor("Samsung", 299.99f);
	Peripheral printer = new Printer("HP", 99.99f);
//	Product cheese = new Cheddar(5.99f);
	order1.addProduct(monitor);
	order1.addProduct(printer);
	System.out.println(order1);

	GenericOrder<Peripheral> order2 = new GenericOrder<Peripheral>();
	System.out.println(order2);
	order2.addProduct(printer);
	GenericOrder<Peripheral> order3 = new GenericOrder<Peripheral>();
	order3.addProduct(monitor);
	System.out.println(order3);
	GenericOrder<ComputerPart> c1 = new ComputerOrder();
	c1.addProduct(new Drive("WD", 7800, 199.99f));
	c1.addProduct(new Motherboard("Asus", 89.99f));
	System.out.println(c1);
//	GenericOrder<ComputerPart>  c2 = new ComputerOrder();
//	c2.addProduct(printer);
//	c2.addProduct(cheese);
//	System.out.println(c2);
	order1.getListContents();

    }

}