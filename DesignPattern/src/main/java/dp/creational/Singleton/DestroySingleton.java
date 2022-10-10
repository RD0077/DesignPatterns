package dp.creational.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DestroySingleton {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		SingletonThreadSafeBillPugh singleton1 = SingletonThreadSafeBillPugh.getInstance();
		SingletonThreadSafeBillPugh singleton2 = null;
		
		Constructor<?>[] constructors = SingletonThreadSafeBillPugh.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			
			Object object = constructor.newInstance();
			singleton2 = (SingletonThreadSafeBillPugh)object;
			
			break;
		}
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
	}
}
