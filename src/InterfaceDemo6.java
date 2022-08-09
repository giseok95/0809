
public class InterfaceDemo6 {
	public static void main(String[] args) {
		product ballpen = new product("Ballpen",200,"모나미");
//		product another = ballpen; //주소복사
		
		product another = (product)(ballpen.copy());
		System.out.println("Berfore Change");
		System.out.println(ballpen);
		System.out.println(another);
		System.out.println("After Change");
		ballpen.setPrice(50000);
		System.out.println(ballpen);
		System.out.println(another);
		}
}
