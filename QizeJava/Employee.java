
public class Employee {

	protected String name;
	protected String id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void gotoOffice() {
		System.out.println(name + "�� ����ϼ̽��ϴ�.");
	}

	public void startJob() {

	}

	public void gotoHome() {
		System.out.println(name + "�� ����ϼ̽��ϴ�.");
	}

}