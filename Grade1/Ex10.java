import java.util.*;

class Ex10 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int a = 0;
		int sum=0;
		for(int i=100;i<=999;i++)
			if(i%7==0) {
			sum=sum+i;
			a++;
	}
	System.out.println("7의 배수의 합 : "+sum);
	System.out.println("7의 배수의 갯수 : "+a);
}
}

//100-999사이에 7의 배수의 갯수와 합을 구하시오