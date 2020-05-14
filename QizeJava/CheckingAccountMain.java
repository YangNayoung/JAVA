
public class CheckingAccountMain {

	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount("111-22-3333333","ȫ�浿",0,"5555-6666-7777-8888");
		obj.deposit(1000000);

		int paidAmount = obj.pay("5555-6666-7777-8888",47000);
		
		obj.pay("5555-6666-7777-9999",2000000);
		
		
	}

}
