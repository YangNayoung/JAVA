// Ŭ������ ���赵 (class), ��ü�� ���赵 ��üȭ (new)
// Ŭ������ new�� �ؼ� ��ü�� ������ְ� �޸𸮿� ����ȴ�. (���?? �����ڸ� ���ؼ�)

public class GrandFa {
	// ����������(public, private ��) ����ϴ� ���� ���� ����(���� �����̶� ������ ������ �ִ� ����� ����� �� �ִ� ������ �ִ� ��)
	private int nai = 80; // ��������
	public String gabo = "��û��"; // ������
	protected String gahun = "��� �Ͽ� �ּ���"; // ���� ����(������)
	// ������ �������� ���������ڸ� ���� ���� �����ؼ� ���� �ϳ��� Ŭ������ 'ĸ��ȭ' �ߴٰ� ��

	public int getNai() { // ���� �˷��ִ� ���� (����Ÿ�� �ʿ��ϴ�.)
		return nai;
	}
	
	public void setNai(int nai) {  // ���� �ٲٴ� ���� (void�� ����Ÿ�� ����.)
		this.nai = nai;
	}
	
	public GrandFa() { // �⺻������ 
		System.out.println("�Ҿƹ��� ������");
	}
	
	public GrandFa(int nai) { // ��Ƽ�� �� �־���ϴ� ������
		super(); // ��� Ŭ������ object �ڼ�
		// this(); ������
		this.nai = nai;
	}
	
	public String say() { // 
		return "�Ҿƹ��� ���� : ����� ���� ��ܶ�";
	}
	
	public String eat() {
		return "���� ���ְ�...";
	}
	
}
