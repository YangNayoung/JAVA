
public class Programmer extends Employee {
	
	private int techGrade;
	
	public Programmer(String name, String id, int techGrade) {
		super(name, id);
		this.techGrade = techGrade;
	}
	
	public void startJob() {
		System.out.println(name + "���� ���α׷� ������ �����ϼ̽��ϴ�.");
	}
	
	public void dispGrade() {
		System.out.println(name + "���� ����� ����� " + techGrade);
	}

}
