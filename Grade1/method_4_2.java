// ���� �� ���� �Ű����� �ְ� �� �� ������ �� ���ϱ�
class method_4_2 {
	public static void a(int x, int y, int sum) {
		for(int i=x; i<=y; i++){
			sum+=i;
		}
		System.out.println(x+" ~ "+y+" �� �� ������ ��: "+sum);
	}
	public static void main(String ar[]) {
		method_4_2 m2 = new method_4_2();
		m2.a(1,5,0);
	}
}