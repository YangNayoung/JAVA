//1~100 중 랜덤의 수 맞추기

import java.util.*;
class Up_Down {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		int no=r.nextInt(100);
		System.out.println("1~100 중 랜덤 숫자 맞추기");
		System.out.println(" 숫자를 입력하세요: ");
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