// 10���� ������ �Է¹޾� �Է¹��� ���� �� ¦���� ������ Ȧ���� ������ ���� ���Ͽ� ���

class Param_ex4 {
	public static void main(String ar[]) {
		int count1=0;
		int count2=0;
		for (int i = 0; i<10; i++)  {
			 int n= Integer.parseInt(ar[i]);
			 if(n%2==0)
				 count1++;
			 else
				 count2++;
		}
		System.out.println("�Է¹��� 10���� ���� �� ¦���� ����: "+count1);
		System.out.println("�Է¹��� 10���� ���� �� Ȧ���� ����: "+count2);
	}
}