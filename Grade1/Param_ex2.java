// ������ �Է¹޾Ƽ� 1���� �Է¹��� ���������� 5�� ����� ���� ���Ͽ� ���

class Param_ex2 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			if(i%5==0)
				sum+=i;
		}
		System.out.println("1~"+n+"������ 5�� ����� ��: "+sum);
	}
}