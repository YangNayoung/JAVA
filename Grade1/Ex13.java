import java.util.*;

class Ex13 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=100;i++) {
			if(i%7==0|i%11==0) {
				System.out.println(i);
			}
		}
	}
}

//1부터 100까지 7의 배수이거나 11의 배수를 출력