// 음료 자판기

import java.util.*;

class Vending_Machine {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("    1. 콜라    2. 커피    3. 물    4. 보리차    ");
		System.out.println("     600원     300원    500원      700원     ");
		System.out.println("-------------------------------------------");
		System.out.println("  금액을 입력하세요: ");
		int won = sc.nextInt();
		while (true)
		{
		System.out.println(" 음료를 선택해주세요(번호 입력): ");
		int drink = sc.nextInt();
		int left = 0;
		if (drink==1) {
			System.out.println(" 음료:  콜라 ");
			left = won - 600;
			System.out.println(" 남은 금액: "+ left);
		}
		else if (drink==2) {
			System.out.println(" 음료: 커피 ");
			left = won -300;
			System.out.println(" 남은 금액: "+ left);
		}
		else if (drink==3) {
			System.out.println(" 음료: 물 ");
			left = won - 500;
			System.out.println(" 남은 금액: "+ left);
		}
		else if (drink==4) {
			System.out.println(" 음료: 보리차 ");
			left = won - 700;
			System.out.println(" 남은 금액: "+ left);
		}
		else {
			System.out.println(" 잘못누르셨습니다.");
		}
		System.out.println("-------------------------------------------");
		System.out.println(" 거스름돈: " + left);
		won = left;
		System.out.println("1000원 " + (left/1000) +"개");
		left = left%1000;
		System.out.println("500원 " + (left/500)+"개");
		left = left%500;
		System.out.println("100원 " + (left/100)+"개");
		left = left%100;
		System.out.println("10원 " + (left/10)+"개");
		System.out.println("-------------------------------------------");
		System.out.println("추가 선택하시겠습니까? (y/n)");
		String choice = sc.next();
		if (choice.equals("y")) {
			System.out.println("추가 선택");
		}
		else if(choice.equals("n")) {
			System.out.println("그만");
			break;
	}
	    else {
			System.out.println("잘못누르셨습니다.");
		}
		System.out.println("------------------------------------------ ");
		}
	}
}
