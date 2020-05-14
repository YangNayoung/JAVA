// 1부터 100까지의 정수 중에서 4의 배수만 출력하되, 한 줄에 8개씩만 출력.

class array_ex2 {
	public static void main(String ar[]) {
		int a[]=new int[100];
		int count=0;
		System.out.println("1~100까지의 정수 중 4의 배수");
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