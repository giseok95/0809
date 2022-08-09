class product implements Comparable<product> {
	private String name;
	private int age;
	private String maker;
	private int price;

	public void setPrice(int price) {
		this.price=price;
	}
	Object copy(){
			Object obj = null;
			try {
				obj=this.clone();
			}catch (CloneNotSupportedException e) {
				System.out.println("이 객체는 복제를 지원하지 않습니다.");
			}
			return obj;
	}

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
		// return obj.name.compareTo(name);
		return this.maker.compareTo(maker);
	}// 앞에 객체 - 뒤에 객체 : 오름차순
} // 뒤에 객체 - 앞에 객체 : 내림차순
