package dp.creational.Singleton;

public class SingletonThreadSafeBillPugh {
	//create a inner static class to hold the instance so whenever getInstance method get called only then 
	//inner class get loaded into memory
	private SingletonThreadSafeBillPugh() {
		
	}
	private static class SingletonHolder{
		private static final SingletonThreadSafeBillPugh INSTANCE=new SingletonThreadSafeBillPugh(); 
	}
	
	public static SingletonThreadSafeBillPugh getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
