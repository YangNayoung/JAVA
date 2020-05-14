// TV_Test 사용하기

class TV_Test1 {
	public static void main(String ar[]) {
		TV_Test t1= new TV_Test();

		t1.brand = "삼성";
		t1.price =  "20만원";
		t1.size = "36인치";
		t1.color = "검정색";

		System.out.println(t1.brand);
		System.out.println(t1.price);
		System.out.println(t1.size);
		System.out.println(t1.color);

		t1.watch();
		t1.listen();
		t1.buy();
	}
}