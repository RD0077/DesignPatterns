package dp.structural.Adapter;

public class WallSocketIMPL implements WallSocket {

	@Override
	public Volt getVolts() {
		// TODO Auto-generated method stub
		return new Volt(240);
	}

}
