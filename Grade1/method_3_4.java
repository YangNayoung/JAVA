// ���� �� �ְ� �Ű����� �ְ� ������� �������� �Ǵ�
class method_3_4 {
	public String a(int x) {
		if (x<0)
			return(x+"�� �����Դϴ�.");
		else 
			return(x+"�� ����Դϴ�.");
	}
	public static void main(String ar[]) {
		method_3_4 m4 = new method_3_4();
		System.out.println(m4.a(5));
	}
}