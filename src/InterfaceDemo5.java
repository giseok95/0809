import java.util.Arrays;

public class InterfaceDemo5 {
	public static void main(String[] args) {
		product [] array = new product[3];
		array[0] = new product("Ballpen", 200, "모나미");
		array[1] = new product("Notebook", 2500000, "Apple");
		array[2] = new product("Keyboard", 2000, "Logitech");
		Arrays.sort(array); System.out.println(Arrays.toString(array));
	}
}

class product implements Comparable<product> {
	private String name;
	private int age;
	private String maker;

	public product(String name, int age, String maker) {
		this.name = name;
		this.age = age;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return String.format("product [name=%s, age=%s, maker=%s]", name, age, maker);
	}

	@Override
	public int compareTo(product obj) {
		//return obj.name.compareTo(name);
		return this.maker.compareTo(maker);
	}//앞에 객체 - 뒤에 객체 : 오름차순
}	 //	뒤에 객체 - 앞에 객체 : 내림차순
