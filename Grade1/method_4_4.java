// ���� �� �ְ� �Ű����� �ְ� �� �� ������ �� ���ϱ�
class method_4_4 {
	public int a(int x, int y, int sum) {
		for(int i=x; i<=y; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String ar[]) {
		method_4_4 m4 = new method_4_4();
		System.out.println(m4.a(1,5,0));
	}
}