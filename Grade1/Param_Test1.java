// ������ �Ű����� cmdâ ����

class Param_Test1 {
	public static void main(String ar[]) {
	/* System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		���ڿ��� ���ڷ� ��ȯ
		int ���� = Integer.parseInt(��ȯ�� ��);*/
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);
		int c = Integer.parseInt(ar[2]);
		// �迭 �� ũ�� ���
		System.out.println(ar.length);
		System.out.println(ar[0]+ar[1]+ar[2]);
		System.out.println(a+b+c);
	}
}