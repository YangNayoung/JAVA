// 리턴 값 없고 매개변수 있고 --> String sub = 매개변수
class Student1 {
	String name;
	String grade;
	String subject;

	public void study(String place, String sub) {
		System.out.println(place+"에서 "+sub+"를 공부하다");
	}
	public void play(String who) {
		System.out.println(who+"와 놀다");
	}
}