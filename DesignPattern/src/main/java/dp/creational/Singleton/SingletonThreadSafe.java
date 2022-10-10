package dp.creational.Singleton;

public class SingletonThreadSafe {
	//Create instance whenever it needed IFF it is null; 
			/*
			 * 1 create private constructor 
			 * 2 create private static variable of the same class 
			 * 3 create a public static method to access/ get the object of the method
			 */
	private static SingletonThreadSafe INSTANCE=null;
	private SingletonThreadSafe()
	{
		
	}
	public static synchronized SingletonThreadSafe getInstance()
	{
		if(INSTANCE==null)
		{
			INSTANCE=new SingletonThreadSafe();
		}
		return INSTANCE;
	}
	//Double checking because of multithreaded environment
	public static SingletonThreadSafe getInstanceDoubleChecking() {
		if (INSTANCE == null) {
			synchronized (SingletonThreadSafe.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonThreadSafe();
				}
			}
		}
		return INSTANCE;
	}
}
