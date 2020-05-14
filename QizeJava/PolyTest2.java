
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
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "만점입니다.");

	}

}
