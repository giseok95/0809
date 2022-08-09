
public class Dog extends Mammal {

	public Dog(String name,int age) {
		super(name,age);
	}
	
	@Override //재정의 안 하면 Dog에 abstract가 붙어야 된다.
	public void saySomething() {
		System.out.println("멍멍멍멍");
	}

}
