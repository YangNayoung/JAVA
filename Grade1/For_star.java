import  java.util.*;

class For_star {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
