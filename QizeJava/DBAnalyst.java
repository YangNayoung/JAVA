
public class DBAnalyst extends Employee {
	
	private String dbms;

	public DBAnalyst(String name, String id, String dbm) {
		super(name, id);
		this.dbms = dbms;
	};
	
	public void dbAdmin() {
		System.out.println(name + "���� ���� ������ " + dbms + "�Դϴ�.");
	}
	
	public void startJob() {
		System.out.println(name + "���� �����ͺ��̽� ������ �����մϴ�.");
	}

}
