// 1���� 100������ ���� �߿��� 4�� ����� ����ϵ�, �� �ٿ� 8������ ���.

class array_ex2 {
	public static void main(String ar[]) {
		int a[]=new int[100];
		int count=0;
		System.out.println("1~100������ ���� �� 4�� ���");
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=i+1;
			if(a[i]%4==0) {
				count++;
				System.out.print(" "+a[i]);
			}
			if (count%8==0)
						System.out.println();
		}
	}
}