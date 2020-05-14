
public class BonusPonitAccount extends Account {
	int bonusPoint;
	
	public BonusPonitAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}



	public void deposit(int amount) {
		super.deposit(amount);
		// balance += amount;
		bonusPoint += (int)(amount + 0.001);
	}
}
