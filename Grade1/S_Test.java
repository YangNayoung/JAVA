class Student3 {
	private String name;
	private int grade;

	public void setName(String s) {
		name=s;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int a) {
		grade=a;
	}
	public int getGrade() {
		return grade;
	}
}

class S_Test {
	public static void main(String ar[]) {
		Student3 s1=new Student3();
		s1.setName("Tom");
		System.out.println(s1.getName());
	}
}