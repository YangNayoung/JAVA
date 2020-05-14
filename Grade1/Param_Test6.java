// 정수 2개를 두 개의 값 사이의 수 합 구하기 (n~m)

class Param_Test6{
	public static void main(String ar[]) {
		 int n = Integer.parseInt(ar[0]);
		 int m = Integer.parseInt(ar[1]);
		 System.out.println(n+" 부터"+m+" 사이의 수의 합");
		 int sum=0;
		 do
		{
			 sum+=n;
			 n++;
		 } while (n<=m);
		 System.out.println("합 : "+sum);
		}
	}