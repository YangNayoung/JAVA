// 4-4. 1+(-2)+3+(-4)+... �� �ؼ� ����� ���ؾ� 100�� �Ǵ���

class Homework_5 {
	public static void main(String ar[]) {
		int sum=0, a=1;
		do
		{
			if (a%2==1) 
				sum+=a;
			else 
				sum+=-a;
			a++;
		}
		while (!(sum==100));
		System.out.println(a-1);
	}
}