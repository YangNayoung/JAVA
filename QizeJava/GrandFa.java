// 클래스는 설계도 (class), 객체는 설계도 실체화 (new)
// 클래스에 new를 해서 객체를 만들어주고 메모리에 저장된다. (어떻게?? 생성자를 통해서)

public class GrandFa {
	// 접근지정자(public, private 등) 사용하는 것은 정보 은닉(정보 은닉이란 정보를 가지고 있는 사람이 사용할 수 있는 권한을 주는 것)
	private int nai = 80; // 개인적인
	public String gabo = "상감청자"; // 공공의
	protected String gahun = "모든 일에 최선을"; // 같은 공간(가족의)
	// 각각의 변수마다 접근지정자를 통해 정보 은닉해서 만든 하나의 클래스를 '캡슐화' 했다고 함

	public int getNai() { // 나이 알려주는 권한 (리턴타입 필요하다.)
		return nai;
	}
	
	public void setNai(int nai) {  // 나이 바꾸는 권한 (void면 리턴타입 없다.)
		this.nai = nai;
	}
	
	public GrandFa() { // 기본생성자 
		System.out.println("할아버지 생성자");
	}
	
	public GrandFa(int nai) { // 인티저 값 넣어야하는 생성자
		super(); // 모든 클래스는 object 자손
		// this(); 생성자
		this.nai = nai;
	}
	
	public String say() { // 
		return "할아버지 말씀 : 어려울 수록 즐겨라";
	}
	
	public String eat() {
		return "밥은 맛있게...";
	}
	
}
