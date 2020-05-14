class Student {
	private String name;
	private int grade;
	private int ban;
	private int telephone;

	Student(String name) {
		this.name=name;
	}
	Student(String name, int grade, int ban, int telephone) {
		this.name=name;
		this.grade=grade;
		this.ban=ban;
		this.telephone=telephone;
	}
	Student(String name, int grade, int telephone) {
		this.name=name;
		this.grade=grade;
		this.telephone=telephone;
	}
	Student(int grade, int ban, int telephone) {
		this.grade=grade;
		this.ban=ban;
		this.telephone=telephone;
	}
	public String study(String x) {
		return x;
	}

	public static void main(String ar[]) {
		Student s1=new Student("장민재");
		Student s2=new Student("김현우");
		Student s3=new Student("Tomas",1,1,111);
		Student s4=new Student("John",6,222);
		Student s5=new Student(2,5,333);

		System.out.println(s3.name+"는 "+s3.grade+"학년이고 전화번호는 "+s3.telephone+"입니다.");
		s5.study("공부하다");
	}
}