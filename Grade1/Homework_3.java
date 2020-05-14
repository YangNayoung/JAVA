// 4-2. 1~20까지 정수 중에서 2또는 3의 배수가 아닌 수의 총합 구하기

class Homework_3 {
	public static void main(String ar[]){
		int sum=0;
		for (int i=1;i<=20 ;i++ )
		{
			if (!(i%2==0 && i%3==0))
				sum+=i;
		}
		System.out.println("1~20까지 2또는 3의 배수가 아닌 수 합: "+sum);
	}
}