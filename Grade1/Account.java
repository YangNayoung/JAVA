import java.util.*;
class Account {
	private String account_NO = "12345678"; //���¹�ȣ
	private String passwd = "1111";  //��й�ȣ
	private String owner;  //������
	private int balance = 30000;  //�ܰ�

	public int deposit(int de) {
		balance+=de;
		return balance;
	} // �Ա� �޼��� 

	public int widthDraw(int wd) {
		balance-= wd;
		return balance;
	} // ��� �޼���

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();

		while(true) {
			System.out.println("=========================================");
			System.out.println(" 1) �Ա�  2) ���  3) �ܰ�Ȯ��  4) ����");
			System.out.println("-----------------------------------------");
			int choose=sc.nextInt(); // ����

			if(choose==4)
				break; // ����

			System.out.print("������: ");
			ac.owner=sc.next();

			System.out.print("���¹�ȣ: ");
			String account_new=sc.next();
		
			System.out.print("��й�ȣ: ");
			String passwd_new=sc.next();

			if (ac.account_NO.equals(account_new) &&ac. passwd.equals(passwd_new))
			{
				if(choose==1) {
					System.out.print("�Ա��� �ݾ��� �Է��ϼ���: ");
					int a=sc.nextInt();
					ac.balance=ac.deposit(a);
					System.out.println("�Ա� �� �ܰ�: "+ac.balance+"��");	
				} // �Ա�

				if(choose==2) {
					System.out.print("����� �ݾ��� �Է��ϼ���: ");
					int a=sc.nextInt();
					ac.balance=ac.widthDraw(a);
					if (ac.balance<0)
						System.out.println("�ܰ� �ȿ� ���� �����մϴ�."); // �ܰ� ���� ������ ��
					else if (ac.balance>0)
						System.out.println("��� �� �ܰ�: "+ac.balance+"��"); // ����� �ܰ� �ܾ� Ȯ��
				} // ���

				if(choose==3) {
					System.out.println("�ܰ�: "+ac.balance+"��");
				} // �ܰ� Ȯ��
			}// if ���¹�ȣ, ��й�ȣ Ȯ�� 

			else if (ac.account_NO.equals(account_new))
			{
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}// else if ��й�ȣ

			else if (ac. passwd.equals(passwd_new))
			{
				System.out.println("���¹�ȣ�� Ʋ���̽��ϴ�.");
			}// else if ���¹�ȣ
		
			else
				System.out.println("���¹�ȣ �� ��й�ȣ�� Ʋ���̽��ϴ�."); // else �� �� Ʋ�� 
			} // while �ݺ���
		} // main 
	} // class






	