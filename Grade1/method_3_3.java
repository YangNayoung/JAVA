// ���� �� �ְ� �Ű����� ���� ������� �������� �Ǵ�
class method_3_3 {
	public String a() {
		int x=5;
		if (x<0)
			return(x+"�� �����Դϴ�.");
		else 
			return(x+"�� ����Դϴ�.");
	}
	public static void main(String ar[]) {
		method_3_3 m3 = new method_3_3();
		System.out.println(m3.a());
	}
}