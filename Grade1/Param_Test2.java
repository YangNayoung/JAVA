// 명령행 매개변수로 숫자 5개를 입력한 후 최대값, 최소값을 구하시오

class Param_Test2 {
	public static void main(String ar[]) {
		int Max=0;
		int Min=999;
		for (int i=0;i<5 ;i++ )
		{
			System.out.print(ar[i]+" ");
			int a=Integer.parseInt(ar[i]);
			if (a>Max)
				Max=a;

			if(a<Min)
				Min=a;
		}
		System.out.println();
		System.out.println("최대값 : "+Max);
		System.out.println("최소값 : "+Min);
	}
}