// 4-2. 1~20���� ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ���� ���ϱ�

class Homework_3 {
	public static void main(String ar[]){
		int sum=0;
		for (int i=1;i<=20 ;i++ )
		{
			if (!(i%2==0 && i%3==0))
				sum+=i;
		}
		System.out.println("1~20���� 2�Ǵ� 3�� ����� �ƴ� �� ��: "+sum);
	}
}