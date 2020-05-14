
public class Chief extends Employee {

	private String part;
	
	public Chief(String name, String id, String part) {
		super(name, id);
		this.part = part;
	}
	
	public void startJob() {
		System.out.println(name + "님이 프로그램 개발팀 직원을 관리합니다.");
	}
	
	public void dispPart() {
		System.out.println(name + "님이 맡고 있는 파트는 " + part);
	}
}
