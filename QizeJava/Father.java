
public class Father extends GrandFa { // GrandFa 상속 (extends)
	
	private int nai = 55;
	private int house = 1;
	public String gabo = "황금돼지";
	
	public int getNai() {
		return nai;
	}

	public int getHouse() {
		return house;
	}
	
	public Father() {
		// super();  (extends 하면 생략되어 있음.)
		System.out.println("아버지 생성자");
	}

	public Father(int nai) {
		this(); // 생성자
		this.nai = nai;
	}
	
	public String say() {
		return "아버지 말씀: 인생을 즐겨라";
	}
	
	public void show() {
		System.out.println(gabo);
	}
	
}
