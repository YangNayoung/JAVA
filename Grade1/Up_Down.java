//1~100 �� ������ �� ���߱�

import java.util.*;
class Up_Down {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		int no=r.nextInt(100);
		System.out.println("1~100 �� ���� ���� ���߱�");
		System.out.println(" ���ڸ� �Է��ϼ���: ");
		for(int Chance=1;Chance<=10;Chance++) {
			int i=sc.nextInt();
			if(i<no) {
				System.out.println("Up");
			}
			else if(i>no) {
				System.out.println("Down");
			}
			else if(i==no) {
				System.out.println("Right");
				return;
			}
		}
		System.out.println("Game Over");
	}
}