
public class CreditLineAccountMain {

	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "�輱��", 10000, 20000000);
		
		System.out.println("����� : " + obj.withdraw(50000));
		System.out.println("�� �� : " + obj.balance);
		System.out.println("���̳ʽ� �ѵ� : " + obj.creditLine);
	}

}
