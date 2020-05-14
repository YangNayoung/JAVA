// 상속은 자식이 먼저 할아버지를 찍고 싶으면 super 사용 (밑으로 갈 수록 우선순위)

public class Myfamily {

	public static void main(String[] args) {
		
		//GrandFa gr = new GrandFa(); // 아무것도 안 하면 기본 생성자를 jvm이 생성함
		//GrandFa gr = new GrandFa(50); // 1.기본 생성자 직접 생성하기,  2.생성자를 만들었으면 인티저 값을 준다.
		// new 객체 생성 (GrandFa의 멤버변수, 메서드 사용가능, 더불어 넣으면 생성자까지)
		
		Father father = new Father(); // GrandFa 상속
		father.show();
		
		//gr.setNai(89); // 할아버지 나이 바꾸기
		//System.out.println(gr.getNai()); // 할아버지 나이 알려주기
		
		Me me = new Me(); // GrandFa와 Father 상속
		
		GrandFa gr = new GrandFa();
		System.out.println("=================");
		System.out.println("가보 "+gr.gabo); // 할아버지 가보
		System.out.println("가훈 "+gr.gahun); // 할아버지 가훈
		System.out.println(gr.say()); //할아버지 말씀
		System.out.println();
		
		GrandFa gr1 = new GrandFa(88); // 생성과 동시에 초기값
		
		System.out.println("=====상속시작=====");
		System.out.println("아버지 나이 "+father.getNai());
		System.out.println("아버지 집 "+ father.getHouse());
		System.out.println("가훈 "+father.gahun);
		System.out.println(father.say());
		
		System.out.println();
		
		System.out.println("내 집 "+me.getHouse());
		System.out.println("가보 "+me.gabo);
		System.out.println("가훈 "+ me.gahun);
		System.out.println(me.say());
		System.out.println(me.eat());
		
		me.biking();
		
		//father.biking()
		//gr.biking()
		
		 Father fal= new Me(); // 업캐스팅, 상속관계였을 때만 가능 (다형성의 시초) 
		 Me me1 = (Me)fal;
		
	}

}
