package dp.structural;

public class Adapter {
	//It is one of the structural design pattern
	//It is used so that two unrelated interfaces work together
	//The object that joins these unrelated interfaces is called an Adapter
	
public static void main(String[] args){
		
		//Creating WallSocket Reference
		WallSocket wallSocket = new WallSocketIMPL();
		//Generating 240 volts by default
		Volt v240 = wallSocket.getVolts();
		System.out.println(v240);
		
		//Creating MobileAdapter Reference
		MobileAdapter mobileAdapter = new MobileAdapterIMPL(wallSocket);
		//Generating 3 volts using Adapter design pattern
		Volt v3 = mobileAdapter.get3Volt();
		System.out.println(v3);
	}
}
