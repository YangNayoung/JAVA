// ���� �� ���� �Ű����� �ְ� ���밪 ���ϱ�
class method_2_2 {
	public static void a(int x) {
		if (x<0)
			System.out.println(x+" ���밪: "+-x);
		else 
			System.out.println(x+" ���밪: "+x);
	}
	public static void main(String ar[]) {
		method_2_2 m2 = new method_2_2();
		m2.a(5);
	}
}