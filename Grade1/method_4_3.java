// ���� �� �ְ� �Ű����� ���� �� �� ������ �� ���ϱ�
class method_4_3 {
	public int a() {
		int x=1, y=5, sum=0;
		for(int i=x; i<=y; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String ar[]) {
		method_4_3 m3 = new method_4_3();
		System.out.println(m3.a());
	}
}