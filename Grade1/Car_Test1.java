// Car Ʋ���� ����ϱ�

class Car_Test1 {
	public static void main(String ar[]) {
		Car_Test c1 = new Car_Test();

		c1.name = "ī�Ϲ�";
		c1.color = "������";
		c1.owner = "�糪��";
		c1.brand = "���" ;
		c1.made = "2018��";

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