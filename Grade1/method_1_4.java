// ���� �� �ְ� �Ű����� �ְ� � ���� ¦������ Ȧ������ �Ǵ�
class method_1_4 {
	public String a(int x) {
		if (x%2==0)
			return("¦��");
		else 
			return("Ȧ��");
	}
	public static void main(String ar[]) {
		method_1_4 m4 = new method_1_4();
		System.out.println(m4.a(5));
	}
}