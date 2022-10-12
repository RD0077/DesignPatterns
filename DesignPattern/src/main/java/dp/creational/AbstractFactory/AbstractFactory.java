package dp.creational.AbstractFactory;

public class AbstractFactory {
/*
 * It is almost similar to Factory pattern except the fact that its more like factory of factories
 * Abstract factory pattern is considered as another layer of abstraction over factory pattern
 * Whenever you need another lavel of abstraction over a group of factories, you shild consider using the abstract factory pattern.
 *  
 */
public static void main(String[] args) {
		
		//Client calls ComputerFactory to Create Computer with different configurations
		Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "120 GB", "2,23 HGZ", true, true));
		System.out.println("PC Config::"+pc);
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "320 GB", "2,29 HGZ", true, true));
		System.out.println("Server Config::"+server);
		
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16 GB", "140 GB", "2,23 HGZ", true, true));
		System.out.println("Laptop Config::"+laptop);
	}
}
