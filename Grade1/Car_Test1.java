// Car 틀래스 사용하기

class Car_Test1 {
	public static void main(String ar[]) {
		Car_Test c1 = new Car_Test();

		c1.name = "카니발";
		c1.color = "블랙베리";
		c1.owner = "양나영";
		c1.brand = "기아" ;
		c1.made = "2018년";

		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.owner);
		System.out.println(c1.brand);
		System.out.println(c1.made);

		c1.go();
		c1.stop();
		c1.parking();
		c1.drive();
	}
}