package dp.structural.Adapter;

public class MobileAdapterIMPL  implements MobileAdapter{

	private WallSocket wallSocket;
	
	public MobileAdapterIMPL(WallSocket wallSocket) {
		this.wallSocket = wallSocket;
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v240=wallSocket.getVolts();
		int v2= v240.getVolts()/80;
		return new Volt(v2) ;
	}

}
