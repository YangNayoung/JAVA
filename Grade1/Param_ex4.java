// 10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력

class Param_ex4 {
	public static void main(String ar[]) {
		int count1=0;
		int count2=0;
		for (int i = 0; i<10; i++)  {
			 int n= Integer.parseInt(ar[i]);
			 if(n%2==0)
				 count1++;
			 else
				 count2++;
		}
		System.out.println("입력받은 10개의 정수 중 짝수의 개수: "+count1);
		System.out.println("입력받은 10개의 정수 중 홀수의 개수: "+count2);
	}
}