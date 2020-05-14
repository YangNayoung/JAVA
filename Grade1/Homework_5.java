// 4-4. 1+(-2)+3+(-4)+... 을 해서 몇까지 더해야 100이 되는지

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