import java.util.*;

class While_1 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("몇 단? :");
		int n= sc.nextInt();
		int i=1;
		while (i<=9)
		{
			System.out.println(n+ "*"+ i +"="+n*i);
			i++;
		}
				}
	}
	// 정수 n을 입력받고 구구단 n단을 출력
/*
int n=2
for(int i=1; i<=9; i++) {
	System.out.println(i*n);
	}
	*/