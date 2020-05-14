
public class EmployeeMain {

	public static void main(String[] args) {
		
		//��� 1. Employee Ŭ���� ��� ���� ���
		/*
		Programmer programmer = new Programmer("����ȣ", "P1234", 3);
		Designer designer = new Designer("����ȯ", "P2213", "�÷���");
		Chief chief = new Chief("ȫ�浿", "P4421", "������ ����");
		
		designer.gotoOffice();
		designer.startJob();
		
		chief.gotoOffice();
		chief.startJob();
		*/
		
		//���2. Employee Ŭ���� ���
		/*
		Employee p1 = new Programmer("����ȣ", "P1234", 3);
		Employee d1 = new Designer("����ȯ", "P2213", "�÷���");
		Employee c1 = new Chief("ȫ�浿", "P4421", "������ ����");
		
		p1.gotoOffice();
		p1.startJob();
		
		d1.gotoOffice();
		d1.startJob();
		
		c1.gotoOffice();
		c1.startJob();
		
		System.out.println();
		
		p1.gotoHome();
		d1.gotoHome();
		c1.gotoHome();
		*/
		
		//���3. �迭 ���
		/*
		Employee employee[] = new Employee[3];
		employee[0] = new Programmer("����ȣ", "P1234", 3);
		employee[1] = new Designer("����ȯ", "P2213", "�÷���");
		employee[2] = new Chief("ȫ�浿", "P4421", "������ ����");
		
		for(int i=0; i<employee.length; i++) {
			employee[i].gotoOffice();
			employee[i].startJob();
		} // for
		
		System.out.println();
		
		// ���� for��
		for(Employee emp : employee) {
			emp.gotoHome();
		} // ���� for��
		*/
		
		//���4. instanceof �̿� upcasting
		/*
		Employee employee[] = new Employee[3];
		employee[0] = new Programmer("����ȣ", "P1234", 3);
		employee[1] = new Designer("����ȯ", "P2213", "�÷���");
		employee[2] = new Chief("ȫ�浿", "P4421", "������ ����");
		
		// ���� for��
		for(Employee emp : employee) {
			emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("�������� ");
			}
			else if(emp instanceof Designer) {
				System.out.print("�����̳��� ");
			}
			else if(emp instanceof Chief) {
				System.out.print("�������� ");
			}
			emp.startJob();
		} // ���� for��
		*/
		
		//���5. instanceof �̿� downcasting
		/*
		Employee employee[] = new Employee[3];
		employee[0] = new Programmer("����ȣ", "P1234", 3);
		employee[1] = new Designer("����ȯ", "P2213", "�÷���");
		employee[2] = new Chief("ȫ�浿", "P4421", "������ ����");
		
		for(Employee emp : employee) {
			//emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("�������� ");
				Programmer programmer = (Programmer) emp;
				programmer.dispGrade();
			}
			else if(emp instanceof Designer) {
				System.out.print("�����̳��� ");
				Designer designer = (Designer) emp;
				designer.dispMajorTech();
			}
			else if(emp instanceof Chief) {
				System.out.print("�������� ");
				Chief chief = (Chief) emp;
				chief.dispPart();
			}
			emp.startJob();
		} // ���� for��
		*/
		Employee employee[] = new Employee[4];
		employee[0] = new Programmer("����ȣ", "P1234", 3);
		employee[1] = new Designer("����ȯ", "P2213", "�÷���");
		employee[2] = new Chief("ȫ�浿", "P4421", "������ ����");
		employee[3] = new DBAnalyst("������", "P3840", "����Ŭ");
		
		for(Employee emp : employee) {
			emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("�������� ");
				Programmer programmer = (Programmer) emp;
				programmer.dispGrade();
			}
			else if(emp instanceof Designer) {
				System.out.print("�����̳��� ");
				Designer designer = (Designer) emp;
				designer.dispMajorTech();
			}
			else if(emp instanceof DBAnalyst) {
				System.out.print("���̺��̽� �������� ");
				DBAnalyst dbanalyst = (DBAnalyst) emp;
				dbanalyst.dbAdmin();
			}
			else if(emp instanceof Chief) {
				System.out.print("�������� ");
				Chief chief = (Chief) emp;
				chief.dispPart();
			}
			emp.startJob();
		} // ���� for��
		
		for (Employee emp : employee) {
			emp.gotoHome();
		}
	} //main
}
