// ���� �� �ְ� �Ű����� ���� � ���� ¦������ Ȧ������ �Ǵ�
class method_1_3 {
	public String a() {
		int x=5;
		if (x%2==0)
			return(x+"�� ¦���Դϴ�.");
		else 
			return(x+"�� Ȧ���Դϴ�.");
	}
	public static void main(String ar[]) {
		method_1_3 m3 = new method_1_3();
		System.out.println(m3.a());
	}
}