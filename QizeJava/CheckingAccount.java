
public class CheckingAccount extends Account {
	public String cardNo;
	
	public int pay(String cardNo, int amount) {
		if(!this.cardNo.equals(cardNo) || amount > balance) {
			System.out.println("����� �Ұ����մϴ�.");
			return 0;
		}
		return withdraw(amount);
	}

	public CheckingAccount(String accountNo, String ownerName, int balance ,String cardNo) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.cardNo = cardNo;
	}
}
