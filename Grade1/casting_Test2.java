class Shape {
	public void draw() {
		System.out.println("도형그리기");
	}
	public void painting() {
		System.out.println("부모 색칠하기");
	} // 에러 없애기 위해, 부모가 자식에게 접근 가능 (오버로딩)
}
class circle extends Shape {
	public void draw() {
		System.out.println("원그리기");
	}
	public void painting() {
		System.out.println("색칠하기");
	}
}

class casting_Test2 {
	public static void main(String ar[]) {
		Shape s=new Shape();
		s.draw(); //도형그리기
		s.painting(); //부모가 자식에게 접근해서 에러발생! 오버로딩 해야함, 부모색칠하기

		circle c1=new circle();
		c1.draw(); //원그리기
		c1.painting(); //색칠하기

		Shape s2=c1; //업캐스팅
		s2.draw(); //원그리기
		s2.painting(); //색칠하기
	}
}