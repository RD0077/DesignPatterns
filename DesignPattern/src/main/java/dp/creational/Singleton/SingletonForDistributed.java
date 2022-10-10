package dp.creational.Singleton;

import java.io.Serializable;

public class SingletonForDistributed implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7797196636176792325L;
	private static SingletonForDistributed INSTANCE = null;

	private SingletonForDistributed() {

	}

	public static SingletonForDistributed getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonForDistributed();
		}
		return INSTANCE;
	}

	public Object readResolve() {
		return getInstance();
	}
}
