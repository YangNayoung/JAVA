
public class Chief extends Employee {

	private String part;
	
	public Chief(String name, String id, String part) {
		super(name, id);
		this.part = part;
	}
	
	public void startJob() {
		System.out.println(name + "���� ���α׷� ������ ������ �����մϴ�.");
	}
	
	public void dispPart() {
		System.out.println(name + "���� �ð� �ִ� ��Ʈ�� " + part);
	}
}
