import javax.naming.NamingException;

public class NullPointExam {

	public static void main(String[] args) throws NamingException {
		try {
			String str = null;
			System.out.println("���ڿ� : " + str.length());
		}
		finally {
			System.out.println("������ ����");
		}
	}
}