//1부터 100까지의 정수중에서 4의 배수만 출력하되, 한 줄에 8개씩만

class Ex9 {
	public static void main(String ar[]) {
	int  count=0;
		for (int i=1; i<=100; i++ )
		{
			if (i%4==0)
			{ 
                    System.out.print(i+"	");
					count++;

					if (count%8==0)
					{
						System.out.println();
					}
			}
		}
	}
}