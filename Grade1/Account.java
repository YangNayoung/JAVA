import java.util.*;
class Account {
	private String account_NO = "12345678"; //계좌번호
	private String passwd = "1111";  //비밀번호
	private String owner;  //예금주
	private int balance = 30000;  //잔고

	public int deposit(int de) {
		balance+=de;
		return balance;
	} // 입금 메서드 

	public int widthDraw(int wd) {
		balance-= wd;
		return balance;
	} // 출금 메서드

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();

		while(true) {
			System.out.println("=========================================");
			System.out.println(" 1) 입금  2) 출금  3) 잔고확인  4) 종료");
			System.out.println("-----------------------------------------");
			int choose=sc.nextInt(); // 선택

			if(choose==4)
				break; // 종료

			System.out.print("예금주: ");
			ac.owner=sc.next();

			System.out.print("계좌번호: ");
			String account_new=sc.next();
		
			System.out.print("비밀번호: ");
			String passwd_new=sc.next();

			if (ac.account_NO.equals(account_new) &&ac. passwd.equals(passwd_new))
			{
				if(choose==1) {
					System.out.print("입금할 금액을 입력하세요: ");
					int a=sc.nextInt();
					ac.balance=ac.deposit(a);
					System.out.println("입금 후 잔고: "+ac.balance+"원");	
				} // 입금

				if(choose==2) {
					System.out.print("출금할 금액을 입력하세요: ");
					int a=sc.nextInt();
					ac.balance=ac.widthDraw(a);
					if (ac.balance<0)
						System.out.println("잔고 안에 돈이 부족합니다."); // 잔고에 돈이 부족할 떄
					else if (ac.balance>0)
						System.out.println("출금 후 잔고: "+ac.balance+"원"); // 출금인 잔고 잔액 확인
				} // 출금

				if(choose==3) {
					System.out.println("잔고: "+ac.balance+"원");
				} // 잔고 확인
			}// if 계좌번호, 비밀번호 확인 

			else if (ac.account_NO.equals(account_new))
			{
				System.out.println("비밀번호가 틀렸습니다.");
			}// else if 비밀번호

			else if (ac. passwd.equals(passwd_new))
			{
				System.out.println("계좌번호가 틀리셨습니다.");
			}// else if 계좌번호
		
			else
				System.out.println("계좌번호 및 비밀번호가 틀리셨습니다."); // else 둘 다 틀림 
			} // while 반복문
		} // main 
	} // class






	