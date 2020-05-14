import java.util.*;

class student {
	public String name;
	public int age;
	public String number;
	public String skil;
	public String address;

	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setNumber(String number) {
		this.number=number;
	}
	public void setSkil(String skil) {
		this.skil=skil;
	}
	public void setAddress(String address) {
		this.address=address;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNumber() {
		return number;
	}
	public String getSkil() {
		return skil;
	}
	public String getAddress() {
		return address;
	}
	public void pr() {
		System.out.println("=================================================");
		System.out.println(this.name+" "+this.age+" "+this.number+" "+this.skil+" "+this.address);
	}
}

class Student_addr {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		student s[] = new student[num];
		for (int i=0; i<num; i++ )
		{
			s[i].setName(sc.next());
			s[i].setAge(sc.nextInt());
			s[i].setNumber(sc.next());
			s[i].setSkil(sc.next());
			s[i].setAddress(sc.next());
		}
		System.out.println("입력인원:>> ");
		System.out.println("==학생정보입력==");
		System.out.println("=======================");
	}		
}