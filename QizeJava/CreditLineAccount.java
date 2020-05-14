
public class CreditLineAccount extends Account {
	int creditLine;

	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	} 
	
	public int withdraw(int amount) {
		if((balance + creditLine) < amount) {
			System.out.println("한도가 넘어서 인출이 불가능합니다.");
			return 0;
		}
		balance -= amount;
		
		return amount;
	}
}
