
public class PolyTest1 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		TV tv = new TV();
		Computer computer = new Computer();
		
		b.buy(tv);
		b.buy(computer);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "만점입니다.");
	}

}
