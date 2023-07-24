//package two;
//
//public class InnerClasss {
//
//	public static void main(String[] args) {
//		Computer C = new Computer();
//		System.out.println(C.Price);
//		int PriceA = C.DisplayPrice();
//		System.out.println(PriceA);
//		
//		Computer.CPU Cp = C.new CPU();
//		System.out.println(Cp.Processor);
//		
//		String P = Cp.DisplayProcessor();
//		System.out.println(Cp.DisplayProcessor());
//		
//
//	}
//
//}
//class Computer{
//	int Price = 100;
//	
//	public int DisplayPrice() {
//		return this.Price;
//	}
//	
//	class CPU{
//		String Processor = "M1";
//		public String DisplayProcessor() {
//			return this.Processor;
//		}
//		
//	}
//}
