package dp.creational.AbstractFactory;

public class ComputerFactory {
	private ComputerFactory() {
		
	}
	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();
	}
}
