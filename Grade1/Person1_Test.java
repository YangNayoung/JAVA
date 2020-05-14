// Person 클래스 만들기.

class Person {

	String name;
	int age;

	public void eat() {
		System.out.println("먹다");
	}
	public void go() {
		System.out.println("가자");
	}
	public static void main(String ar[]) {
		Person p1 = new Person();

		p1.name = "Mike";
		p1.age = 30;
		System.out.println(p1.name + "\n" + p1.age);

		p1.eat();
		p1.go();

		Person p2 = new Person();

		p2.name = "Tom";
		p2.age = 25;
		System.out.println("\n" + p2.name + "\n" + p2.age);

		p2.eat();
		p2.go();
	}
}