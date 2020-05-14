// 추상 클래스는 abstract, 상속을 받아서 자식이 오버라이딩해야함. 클래스가 1개라도 abstract을 가지고 있으면 추상 클래스 

abstract public class Animal {
	
	abstract public String name();
	abstract public String eat();
	abstract public String action();
	
	public void print() {
		System.out.println("Animal 클래스의 print 메소드");
	}
}
