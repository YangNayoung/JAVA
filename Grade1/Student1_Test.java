class Student1_Test {
	public static void main(String ar[]) {
		Student1 s1 = new Student1();
		s1.name = "�糪��";
		s1.grade = "�̸������������а���б� 1�г�";
		s1.subject = "�ڹ�";

		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(s1.subject);

		s1.study("�б�","English");
		s1.study("�б�", s1.subject);
		s1.play("ģ��");
	}
}