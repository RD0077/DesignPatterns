package dp.creational.Singleton;

public class SingletonLazyInitialization {
	//Create instance whenever it needed IFF it is null; 
		/*
		 * 1 create private constructor 
		 * 2 create private static variable of the same class 
		 * 3 create a public static method to access/ get the object of the method
		 */
	private static SingletonLazyInitialization INSTANCE=null;
	private SingletonLazyInitialization()
	{
		
	}
	public static SingletonLazyInitialization getInstance() {
		if(INSTANCE==null)
		{
			INSTANCE= new SingletonLazyInitialization();
		}
		return INSTANCE;
	}

}
