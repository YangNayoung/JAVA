// 100������ �ڿ��� n�� �Է¹޾� 1���� n������ ����� ���

class Param_ex3 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int count=0;
		float sum=0;
		float avg=0;
		for (int i=1; i<n ; i++)
		{
			count++;
			sum+=i;
		}
		avg=sum/count;
		System.out.println("1~"+n+"������ ���: "+avg);
	}
}