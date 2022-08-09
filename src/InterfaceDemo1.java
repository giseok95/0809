/*
 * 5.interface는 다중 상속이 가능하기 때문에 모든 메소드를 재정의해야 한다.
 * 6.interface의 주소는 해당 인터페이스의 재정의 된 메소드만 접근 가능하다.
 * 7.interface배열에는 해당 인터페이스의 자식 클래스를 넣을 수 있다.
 */
public class InterfaceDemo1 extends Object implements Father, Mother {

	@Override
	public void grandFathe() {
		System.out.println("called by grandfather()");
	}

	@Override
	public void grandMother() {
		System.out.println("called by grandmother()");
	}

	@Override
	public void mother() {
		System.out.println("called by mother()");
	}

	@Override
	public void father() {
		System.out.println("called by father()");
	}
	public static void main(String[] args) {
//		GrandFather gFather = new InterfaceDemo1(); 
//		gFather.grandFathe();
//		Father father =new InterfaceDemo1();
//		father.grandFathe(); father.grandMother(); father.father();
		Mother []array = new Mother[3]; 
		array[0] = new InterfaceDemo1();
		array[0].mother();
		
		System.out.println("Father's Max="+Father.MAX);
		System.out.println("Mother's Max="+Mother.MAX);
	}
}
