package two;

public class July23Program7 {

	public static void main(String[] args) {
		VehiclePG XYZ = VehiclePG.getinstance();
		XYZ.getNV();
		

	}

}

class VehiclePG{
	//make a private reference variable
	private  static VehiclePG NV;
	
	
	
	
	
	//make a private constructor
	private VehiclePG() {
		
	}
	
	
	
	
	
	
	//make a static method which returns vehiclePG object
	public static VehiclePG getinstance() {
		if (NV==null) {
			NV = new VehiclePG();
		}
		return NV;
	}
	
	
	
	
	
	//make a method to call on a object
	public void getNV() {
		System.out.println("Congrats on your new vehicle");
	}
	
	
	
	
	
	
	
}
