// TV_Test ����ϱ�

class TV_Test1 {
	public static void main(String ar[]) {
		TV_Test t1= new TV_Test();

		t1.brand = "�Ｚ";
		t1.price =  "20����";
		t1.size = "36��ġ";
		t1.color = "������";

		System.out.println(t1.brand);
		System.out.println(t1.price);
		System.out.println(t1.size);
		System.out.println(t1.color);

		t1.watch();
		t1.listen();
		t1.buy();
	}
}