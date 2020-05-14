
public class EmployeeMain {

	public static void main(String[] args) {
		
		//방법 1. Employee 클래스 사용 안한 경우
		/*
		Programmer programmer = new Programmer("박찬호", "P1234", 3);
		Designer designer = new Designer("안정환", "P2213", "플래쉬");
		Chief chief = new Chief("홍길동", "P4421", "윈도우 개발");
		
		designer.gotoOffice();
		designer.startJob();
		
		chief.gotoOffice();
		chief.startJob();
		*/
		
		//방법2. Employee 클래스 사용
		/*
		Employee p1 = new Programmer("박찬호", "P1234", 3);
		Employee d1 = new Designer("안정환", "P2213", "플래쉬");
		Employee c1 = new Chief("홍길동", "P4421", "윈도우 개발");
		
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
		
		//방법3. 배열 사용
		/*
		Employee employee[] = new Employee[3];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Chief("홍길동", "P4421", "윈도우 개발");
		
		for(int i=0; i<employee.length; i++) {
			employee[i].gotoOffice();
			employee[i].startJob();
		} // for
		
		System.out.println();
		
		// 향상된 for문
		for(Employee emp : employee) {
			emp.gotoHome();
		} // 향상된 for문
		*/
		
		//방법4. instanceof 이용 upcasting
		/*
		Employee employee[] = new Employee[3];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Chief("홍길동", "P4421", "윈도우 개발");
		
		// 향상된 for문
		for(Employee emp : employee) {
			emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("개발자인 ");
			}
			else if(emp instanceof Designer) {
				System.out.print("디자이너인 ");
			}
			else if(emp instanceof Chief) {
				System.out.print("관리자인 ");
			}
			emp.startJob();
		} // 향상된 for문
		*/
		
		//방법5. instanceof 이용 downcasting
		/*
		Employee employee[] = new Employee[3];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Chief("홍길동", "P4421", "윈도우 개발");
		
		for(Employee emp : employee) {
			//emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("개발자인 ");
				Programmer programmer = (Programmer) emp;
				programmer.dispGrade();
			}
			else if(emp instanceof Designer) {
				System.out.print("디자이너인 ");
				Designer designer = (Designer) emp;
				designer.dispMajorTech();
			}
			else if(emp instanceof Chief) {
				System.out.print("관리자인 ");
				Chief chief = (Chief) emp;
				chief.dispPart();
			}
			emp.startJob();
		} // 향상된 for문
		*/
		Employee employee[] = new Employee[4];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Chief("홍길동", "P4421", "윈도우 개발");
		employee[3] = new DBAnalyst("류현진", "P3840", "오라클");
		
		for(Employee emp : employee) {
			emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("개발자인 ");
				Programmer programmer = (Programmer) emp;
				programmer.dispGrade();
			}
			else if(emp instanceof Designer) {
				System.out.print("디자이너인 ");
				Designer designer = (Designer) emp;
				designer.dispMajorTech();
			}
			else if(emp instanceof DBAnalyst) {
				System.out.print("데이베이스 관리자인 ");
				DBAnalyst dbanalyst = (DBAnalyst) emp;
				dbanalyst.dbAdmin();
			}
			else if(emp instanceof Chief) {
				System.out.print("관리자인 ");
				Chief chief = (Chief) emp;
				chief.dispPart();
			}
			emp.startJob();
		} // 향상된 for문
		
		for (Employee emp : employee) {
			emp.gotoHome();
		}
	} //main
}
