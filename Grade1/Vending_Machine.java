// ���� ���Ǳ�

import java.util.*;

class Vending_Machine {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("    1. �ݶ�    2. Ŀ��    3. ��    4. ������    ");
		System.out.println("     600��     300��    500��      700��     ");
		System.out.println("-------------------------------------------");
		System.out.println("  �ݾ��� �Է��ϼ���: ");
		int won = sc.nextInt();
		while (true)
		{
		System.out.println(" ���Ḧ �������ּ���(��ȣ �Է�): ");
		int drink = sc.nextInt();
		int left = 0;
		if (drink==1) {
			System.out.println(" ����:  �ݶ� ");
			left = won - 600;
			System.out.println(" ���� �ݾ�: "+ left);
		}
		else if (drink==2) {
			System.out.println(" ����: Ŀ�� ");
			left = won -300;
			System.out.println(" ���� �ݾ�: "+ left);
		}
		else if (drink==3) {
			System.out.println(" ����: �� ");
			left = won - 500;
			System.out.println(" ���� �ݾ�: "+ left);
		}
		else if (drink==4) {
			System.out.println(" ����: ������ ");
			left = won - 700;
			System.out.println(" ���� �ݾ�: "+ left);
		}
		else {
			System.out.println(" �߸������̽��ϴ�.");
		}
		System.out.println("-------------------------------------------");
		System.out.println(" �Ž�����: " + left);
		won = left;
		System.out.println("1000�� " + (left/1000) +"��");
		left = left%1000;
		System.out.println("500�� " + (left/500)+"��");
		left = left%500;
		System.out.println("100�� " + (left/100)+"��");
		left = left%100;
		System.out.println("10�� " + (left/10)+"��");
		System.out.println("-------------------------------------------");
		System.out.println("�߰� �����Ͻðڽ��ϱ�? (y/n)");
		String choice = sc.next();
		if (choice.equals("y")) {
			System.out.println("�߰� ����");
		}
		else if(choice.equals("n")) {
			System.out.println("�׸�");
			break;
	}
	    else {
			System.out.println("�߸������̽��ϴ�.");
		}
		System.out.println("------------------------------------------ ");
		}
	}
}
