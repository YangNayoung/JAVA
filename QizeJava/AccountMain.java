
public class AccountMain {

	public static void main(String[] args) {
		
		Account obj1 = new Account("111-222-3333333","�迵��",200000);
		Account obj2 = new Account("555-666-7777777","������",1000000);
	
		obj1.deposit(1000000);
		printAccount(obj1);
		
		obj2.withdraw(200000);
		printAccount(obj2);
	}
		public static void printAccount(Account obj) {
			System.out.println("���¹�ȣ: "+obj.accountNo);
			System.out.println("�������̸�: "+obj.ownerName);
			System.out.println("�ܾ�: "+obj.balance);
			System.out.println();
		}

}
