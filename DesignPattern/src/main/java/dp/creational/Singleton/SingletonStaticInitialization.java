package dp.creational.Singleton;

public class SingletonStaticInitialization {
	//Static initialization helps to handle Exception
	/*
	 * 1 create private constructor 
	 * 2 create private static variable of the same class 
	 * 3 create a public static method to access/ get the object of the method
	 */
	private static SingletonStaticInitialization INSTANCE = null;
	static {
		try {
			if (INSTANCE == null) {
				INSTANCE = new SingletonStaticInitialization();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private SingletonStaticInitialization() {

	}

	public static SingletonStaticInitialization getInstance() {
		return INSTANCE;
	}
}
