// ���� �� �ְ� �Ű����� �ְ� ���밪 ���ϱ�
class method_2_4 {
	public int a(int x) {
		if (x<0)
			return (-x);
		else 
			return (x);
	}
	public static void main(String ar[]) {
		method_2_4 m4 = new method_2_4();
		System.out.println(m4.a(-5));
	}
}