//100 이하의 두 개의 두 개의 정수를 입력받아 작은수부터 큰 수까지 차례대로 출력
//예) 3, 8   3,4,5,6,7,8   8, 3
import java.util.*;

class Ex5 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("100이하의 두 개의 정수를 입력:");
		
		int a= sc.nextInt();
		int b= sc.nextInt();

		if(a<b) { 
			 for(int c=a; c<=b; c++) {
				 System.out.print(" "+c);
			 }
		}
			 else {
				 for(int c=a; c<=b; c++) {
				 System.out.print(" "+c);
			 }
			 }
	}
}