class Person2 {
	private String name;
	private int age;

	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public Person2(int age) {
		this.age=age;
	}
	public Person2(String name) {
		this.name=name;
	}
	public String eat(String x) {
		return x;
	}
	Person2() {} //--> 기본생성자 만들기 (생성자가 있을 경우)
public static void main(String ar[]) {
	Person2 p1=new Person2("Mike",30);
	Person2 p2=new Person2("Alice",25);
	Person2 p3=new Person2(35);
	Person2 p4=new Person2("Tom");
	Person2 p5=new Person2();

	System.out.println(p3.name+" // "+p3.age);
	System.out.println(p4.eat("먹다"));
	}
}