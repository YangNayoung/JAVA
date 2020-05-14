class Student3 {
	private String name;
	private int grade;

	public void setName(String s) {
		name=s;
	}
}

class S_Test {
	public static void main(String ar[]) {
		Student3 s1=new Student3();
		s1.setName("Tom");
	}
}