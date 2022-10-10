package dp.creational.Singleton;

public class SingletonClonePrevent  implements Cloneable{
	
	private static SingletonClonePrevent INSTANCE=null;
	private SingletonClonePrevent() {
		
	}
	public static SingletonClonePrevent getInstance()
	{
		if (INSTANCE==null)
		{
			INSTANCE= new SingletonClonePrevent();
		}
		return INSTANCE;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("You can not create clone");
		//return super.clone();
	}
}
