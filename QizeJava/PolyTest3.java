
public class PolyTest3 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		TV tv = new TV();
		Computer computer = new Computer();
		Audio audio = new Audio();
		AIFreeze aifreeze = new AIFreeze();
		
		b.buy(tv);
		b.buy(audio);
		System.out.println();
		b.summary();
		
		System.out.println();
		b.refund(tv);
		b.summary();
		
		b.buy(aifreeze);

	}

}
