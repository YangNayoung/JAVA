class Student1_Test {
	public static void main(String ar[]) {
		Student1 s1 = new Student1();
		s1.name = "양나영";
		s1.grade = "미림여자정보과학고등학교 1학년";
		s1.subject = "자바";

		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(s1.subject);

		s1.study("학교","English");
		s1.study("학교", s1.subject);
		s1.play("친구");
	}
}