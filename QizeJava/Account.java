
public class Account {
	public String accountNo;
	public String ownerName;
	public int balance; 
	
	public Account() {
		
	}
	
	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}
	
	public Account(String accountNo, String ownerName) {
		this(accountNo);
		//this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this(accountNo, ownerName);
		//this.accountNo = accountNo;
		//this.ownerName = ownerName;
		this.balance = balance;
	}


	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(balance < amount)
			return 0; 
		balance -= amount;
		return 0;
	}
	
}
