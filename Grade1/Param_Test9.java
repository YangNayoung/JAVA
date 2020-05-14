/* 두개의 값을 입력받아 두 정수 사이에 3의 배수이거나 7의 배수인
 수들의 합과 평균 출력*/

 class Param_Test9 {
	 public static void main(String ar[]) {
		 int n = Integer.parseInt(ar[0]);
		 int m = Integer.parseInt(ar[1]);
		 System.out.println(n+" 부터"+m+" 사이의 3의 배수나 7의 배수인 수들의 합과 평균");
		 int sum=0;
		 float avg=0,count=0;
		 do
		 {
		 if(n%3==0||n%7==0) {
			    count++;
				sum+=n;
				avg=sum/count;
			}
			n++;
		} while (n<=m);
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+avg);
	 }
 }