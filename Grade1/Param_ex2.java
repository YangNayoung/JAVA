// 정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력

class Param_ex2 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			if(i%5==0)
				sum+=i;
		}
		System.out.println("1~"+n+"까지의 5의 배수의 합: "+sum);
	}
}