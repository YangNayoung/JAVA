
public class PolyTest1 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		TV tv = new TV();
		Computer computer = new Computer();
		
		b.buy(tv);
		b.buy(computer);
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint + "�����Դϴ�.");
	}

}
