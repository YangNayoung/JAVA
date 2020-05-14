// 100~999 사이에 4의 배수가 아닌수들의 갯수와 합을 구하세요.

class array_ex4 {
	public static void main(String ar[]) {
		int a[]=new int[899];
		int count=0;
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=i+100;
			if(a[i]%4!=0) {
				count++;
				sum+=a[i];
			}
		}
		System.out.println("100~999 사이에 4의 배수가 아닌 수들의 갯수: "+count);
		System.out.println("100~999 사이에 4의 배수가 아닌 수들의 합: "+sum);
	}
}