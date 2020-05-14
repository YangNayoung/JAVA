// n,m을 입력받아 n부터 m사이의 정수의 평균을 구하시오

class Param_Test8 {
	public static void main(String ar[]) {
		 int n = Integer.parseInt(ar[0]);
		 int m = Integer.parseInt(ar[1]);
		 System.out.println(n+" 부터"+m+" 사이의 정수의 평균");
		 int sum=0;
		 float avg=0,count=0;
		 do
		 {
			 count++;
			 sum+=n;
			 avg=sum/count;
			 n++;
		 } while (n<=m);
		 System.out.println("평균 : "+avg);
	}
}