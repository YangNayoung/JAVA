
public class Designer extends Employee {
	
	private String majorTech;
	
	public Designer(String name, String id, String majorTech) {
		super(name, id);
		this.majorTech = majorTech;
	}
	
	public void startJob() {
		System.out.println(name + "님이 디자인 업물를 시작하셨습니다.");
	}
	
	public void dispMajorTech() {
		System.out.println(name + "님이 맡고 있는 파트는 " + majorTech);
	}
}
