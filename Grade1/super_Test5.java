class Greeting {
	String name="Mike";
	public void sayHello() {
		System.out.println("¾È³ç");
	}
}

class EmgHello extends Greeting {
	String name="Moon";
	public void sayHello() {
		System.out.println("nice to meet you");
	}
	public void test() {
		System.out.println(super.name);
		super.sayHello();
	}
}

class super_Test5 {
	public static void main(String ar[]) {
		EmgHello e=new EmgHello();
		e.test();
		e.sayHello();
	}
}