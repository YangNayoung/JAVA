class Book1 {
	private String title;
	private int page;
	private String writer;

	Book1 (String title, int page, String writer) {
		this. title=title;
		this. page=page;
		this. writer=writer;
	}
	public String toString() {  return "[����] "+title+ "[������ ��] "+page+"�� "+"[����] "+writer; }
}

class magazine extends Book1 {
	public String date;

	magazine (String title, int page, String writer, String date) {
		super(title, page, writer);
		this. date=date;
	}
	public String toString() {  return super.toString()+" [�߸���] "+date; }
}

class Ex4 {
	public static void main(String ar[]) {
		magazine m1=new magazine("������� �������� �ű��� ����", 226, "����Ʈ ��ī�з�", "2009�� 02�� 27��");

		System.out.println(m1.toString());
	}
}