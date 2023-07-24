package two;

public class Singleton01 {

	public static void main(String[] args) {
		Database obj;
		obj=Database.getinstance();
		obj.getconnect();
		

	}

}
class Database{
	//properties with object
	private static Database DB;
	
	//default construction (not needed)
	private Database() {
		
	}
	//method with return type
	public static Database getinstance() {
		if(DB==null) {
			DB=new Database();
		}
		return DB;
		
		
	}
	
	//without return type doesn't work without (with return type)
	//method without return type
	public void getconnect() {
		System.out.println("This is connection");
	}
	
	
}
