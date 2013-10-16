
class Main {

    public static void main(String xxx[]) throws IllegalArgumentException, IllegalAccessException {
     
 //Initialize supporting objects

        Product monitor = new Monitor("Samsung", 299.99f);
        Product printer = new Printer("HP", 99.99f);
        Product cheese = new Cheddar(5.99f);
        Product drive = new Drive("WD", 7800, 199.99f);
        Product assemblyService = new AssemblyService("Microtech", 55f);

        //Test GenericOrder type
        GenericOrder order1 = new GenericOrder();
        order1.addProduct(monitor);
        order1.addProduct(printer);
        order1.addProduct(assemblyService);
        order1.addProduct(cheese);
        order1.addProduct(drive);
//        System.out.println("Testing GenericOrder... \n");
//        System.out.println(order1);

        //Test ComputerOrder type
        GenericOrder computerOrder1 = new ComputerOrder();
        computerOrder1.addProduct(drive);
        computerOrder1.addProduct(assemblyService);
        computerOrder1.addProduct(printer);
       // computerOrder1.addProduct(cheese); throws a CastClassException!
//		System.out.println("Testing ComputerOrder... \n");
//		System.out.println(computerOrder1);
        
        //Test OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.accept(order1);
        orderProcessor.accept(computerOrder1);
        //Test dispatchXXX()
//        System.out.println("Testing dispatchXXX()...\n");
//        orderProcessor.dispatchXXX();
        //Test dispatchComputerParts()
        //System.out.println("Testing dispatchComputerParts()...\n");
        //orderProcessor.dispatchComputerParts();
        orderProcessor.process();
        System.out.println("Testing dispatchXXX() after running proces()\n");
        orderProcessor.dispatchXXX();


  }

}
