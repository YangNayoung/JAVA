import java.util.*;
abstract class ShapeExam {
	public abstract double getArea();
	public abstract double getCircum();
}

class  abs_Test2 extends ShapeExam {
	Scanner sc=new Scanner(System.in);
	int r;
	r=sc.next();
	double getArea(double r) {
		return (r*2*PI);
	}
	double getCircum(double r) {
		return (r*2*PI);
	}
		abs_Test2 t2=new abs_Test2();
		System.out.println(t2.getArea());
		System.out.println(t2.getCircum());
	}
}