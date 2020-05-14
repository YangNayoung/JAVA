// 100~999 사이에 7의 배수의 갯수와 합을 구하세요.

class array_ex3 {
	public static void main(String ar[]) {
		int a[]=new int[899];
		int count=0;
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=i+100;
			if(a[i]%7==0) {
				count++;
				sum+=a[i];
			}
		}
		System.out.println("100~999 사이에 7의 배수 갯수: "+count);
		System.out.println("100~999 사이에 7의 배수의 합: "+sum);
	}
}