package dp.creational.Singleton;

public class SingletonEagerInitialization {
	/*
	 * 1 create private constructor 
	 * 2 create private static variable of the same class 
	 * 3 create a public static method to access/ get the object of the method
	 */
	private static final SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

	private SingletonEagerInitialization() {

	}

	public static SingletonEagerInitialization getInstance() {
		return INSTANCE;
	}
}
