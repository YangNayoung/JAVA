class Book1 {
	private String title;
	private int page;
	private String writer;

	Book1 (String title, int page, String writer) {
		this. title=title;
		this. page=page;
		this. writer=writer;
	}
	public String toString() {  return "[제목] "+title+ "[페이지 수] "+page+"쪽 "+"[저자] "+writer; }
}

class magazine extends Book1 {
	public String date;

	magazine (String title, int page, String writer, String date) {
		super(title, page, writer);
		this. date=date;
	}
	public String toString() {  return super.toString()+" [발매일] "+date; }
}

class Ex4 {
	public static void main(String ar[]) {
		magazine m1=new magazine("에드워드 툴레인의 신기한 여행", 226, "케이트 디카밀로", "2009년 02월 27일");

		System.out.println(m1.toString());
	}
}