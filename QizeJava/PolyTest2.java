
public class PolyTest2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		TV tv = new TV();
		Computer computer = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		
		b.summary();
		
		b.buy(computer);
		b.buy(audio);
		 System.out.println();
		b.summary();
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint + "�����Դϴ�.");

	}

}
