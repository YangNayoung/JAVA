// 100이하의 자연수 n을 입력받아 1부터 n까지의 평균을 출력

class Param_ex3 {
	public static void main(String ar[]) {
		int n = Integer.parseInt(ar[0]);
		int count=0;
		float sum=0;
		float avg=0;
		for (int i=1; i<n ; i++)
		{
			count++;
			sum+=i;
		}
		avg=sum/count;
		System.out.println("1~"+n+"까지의 평균: "+avg);
	}
}