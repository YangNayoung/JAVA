//100 ������ �� ���� �� ���� ������ �Է¹޾� ���������� ū ������ ���ʴ�� ���
//��) 3, 8   3,4,5,6,7,8   8, 3
import java.util.*;

class Ex5 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("100������ �� ���� ������ �Է�:");
		
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