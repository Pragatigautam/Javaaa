package two;
//singleton ma euta matra object banaucha,,, database sanga connection bananuna
public class Singletonn {

	public static void main(String[] args) {
		
		
//		VehicleOOP V1 = new VehicleOOP();
		
		 VehicleOOP ABC = VehicleOOP.getinstance();
		 ABC.getCRV();
		
		
		

	}

}
class VehicleOOP {
	
	private static VehicleOOP CRV; 
	private VehicleOOP() {
		
	}
	public static VehicleOOP getinstance() {
		if (CRV==null) {
			CRV=new VehicleOOP();
			
		}
		return CRV;
	}
	public void getCRV() {
		System.out.println("Welcome to VehicleOOP");
	}
}
