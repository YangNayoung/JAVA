
public class Father extends GrandFa { // GrandFa ��� (extends)
	
	private int nai = 55;
	private int house = 1;
	public String gabo = "Ȳ�ݵ���";
	
	public int getNai() {
		return nai;
	}

	public int getHouse() {
		return house;
	}
	
	public Father() {
		// super();  (extends �ϸ� �����Ǿ� ����.)
		System.out.println("�ƹ��� ������");
	}

	public Father(int nai) {
		this(); // ������
		this.nai = nai;
	}
	
	public String say() {
		return "�ƹ��� ����: �λ��� ��ܶ�";
	}
	
	public void show() {
		System.out.println(gabo);
	}
	
}
