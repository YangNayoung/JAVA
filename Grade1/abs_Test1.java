abstract class Person30 {
	String name;
	int age;
	public void go() {
		System.out.println("°¡´Ù");
		}
	abstract public void walk();
	abstract public int count(int num); //ÀÎ¿ø¼ö
}
abstract class child extends Person30 {
	public void walk() {
		System.out.println("°È´Ù");
		}
}
class child1 extends Person30 {
	public void walk() {
		System.out.println("°È´Ù");
		}
	public int count(int num) {
		return num;
	}
}
class abs_Test1 {
	public static void main(String ar[]) {
		child1 c1=new child1();
		c1.walk();
		System.out.println(c1.count(10));
	}
}