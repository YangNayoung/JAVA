class Exercise6_4 {
	public static void main(String ar[]) {
		Student s=new Student();

		s.name="ȫ�浿";
		s.ban=1;
		s.kor=100;
		s.eng=60;
		s.math=76;

		System.out.println("�̸�: "+s.name);
		System.out.println("����: "+s.getTotal());
		System.out.println("���: "+s.getAverage());
	}
}
class Student {
	String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	public int total=0;
	public float average=0;

	public int getTotal() {
		return (kor+eng+math);
	}
	public float getAverage() {
		return ((float)(kor+eng+math)/3);
	}
}