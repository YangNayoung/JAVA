
public class Designer extends Employee {
	
	private String majorTech;
	
	public Designer(String name, String id, String majorTech) {
		super(name, id);
		this.majorTech = majorTech;
	}
	
	public void startJob() {
		System.out.println(name + "���� ������ ������ �����ϼ̽��ϴ�.");
	}
	
	public void dispMajorTech() {
		System.out.println(name + "���� �ð� �ִ� ��Ʈ�� " + majorTech);
	}
}
