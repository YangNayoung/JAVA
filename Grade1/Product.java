import java.util.*;

class Product_1 {
	private  String id, info, maker, price;
	Product_1 (String id, String info, String maker, String price) {
		this.id=id;
		this.info=info;
		this.maker=maker;
		this.price=price;
	}
	public void setId (String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setInfo (String info) {
		this.info=info;
	}
	public String getInfo() {
		return info;
	}
	public void setMaker (String maker) {
		this.maker=maker;
	}
	public String getMaker() {
		return maker;
	}
	public void setPrice (String price) {
		this.price=price;
	}
	public String getPrice() {
		return price;
	}
	public void show() { 
		System.out.print("��ǰID: "+id+" ��ǰ ����: "+info+" ������: "+maker+" ����: "+price); 
	}
}

class Book extends Product_1 {
	private String title, author, isbn;
	public Book(String id, String info, String maker, String price, String title, String author, String isbn) {
		super(id, info, maker, price);
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public void setTitle (String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setAnthor (String author) {
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setIsbn (String isbn) {
		this.isbn=isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	public void show() {
		super.show();
		System.out.println(" å ����: "+title+" ����: "+author+" ISBN: "+isbn);
	}
}

class Music extends Product_1 {
	private String titlesong, singer;
	public Music(String id, String info, String maker, String price, String titlesong, String singer) {
		super(id, info, maker, price);
		this.titlesong=titlesong;
		this.singer=singer;
	}
	public void setTitlesong (String titlesong) {
		this.titlesong=titlesong;
	}
	public String getTitlesong() {
		return titlesong;
	}
	public void setSinger (String singer) {
		this.singer=singer;
	}
	public String getSinger() {
		return singer;
	}
	public void show() {
		super.show();
		System.out.println(" �뷡 ����: "+titlesong+" ����: "+singer);
	}
}

class Conversation extends Product_1 {
	private String title1, author1, isbn1;
	public Conversation(String id, String info, String maker, String price,String title1, String author1, String isbn1) {
		super(id, info, maker, price);
		this.title1=title1;
		this.author1=author1;
		this.isbn1=isbn1;
	}
	public void setTitle1 (String title1) {
		this.title1=title1;
	}
	public String getTitle1() {
		return title1;
	}
	public void setAnthor1 (String author1) {
		this.author1=author1;
	}
	public String getAuthor1() {
		return author1;
	}
	public void setIsbn1 (String isbn1) {
		this.isbn1=isbn1;
	}
	public String getIsbn1() {
		return isbn1;
	}
	public void show() {
		super.show();
		System.out.println(" ȸȭå ����: "+title1+" ����: "+author1+" ISBN: "+isbn1);
	}
}

 class Product {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Product_1 p[]=new Product_1[10];
		int count=0; // ������ ��ǰ ����
		
		while (true) {
			System.out.print("==��ǰ�߰�[1]  ��ǰ��ȸ[2]  ������[3]==> ");
			int main_choice=sc.nextInt();
			if (main_choice==1) { // ��ǰ �߰�
				System.out.print("==��ǰ ����-> å[1]  ����CD[2]  ȸȭå[3]==> ");
				int num=sc.nextInt();
				switch (num) {
					case 1: 
						System.out.print("��ǰ ID>> "); 
						String id=sc.next();
						System.out.print("��ǰ ����>> "); 
						String info=sc.next();
						System.out.print("������>> "); 
						String maker=sc.next();
						System.out.print("����>> "); 
						String price=sc.next();
						System.out.print("å����>> "); 
						String title=sc.next();
						System.out.print("����>> "); 
						String author=sc.next();
						System.out.print("ISBN>> "); 
						String isbn=sc.next();

						p[count]=new Book(id, info, maker, price, title, author, isbn);
						p[count].show();
						count++;
						break;
				case 2: 
						System.out.print("��ǰ ID>> "); 
						 id=sc.next();
						System.out.print("��ǰ ����>> "); 
						 info=sc.next();
						System.out.print("������>> "); 
						 maker=sc.next();
						System.out.print("����>> "); 
						 price=sc.next();
						System.out.print("�뷡 ����>> "); 
						String titlesong=sc.next();
						System.out.print("����>> "); 
						String singer=sc.next();

						p[count]=new Music(id, info, maker, price, titlesong, singer);
						p[count].show();
						count++; 
						break;
				case 3:
					System.out.print("��ǰ ID>> "); 
					id=sc.next();
					System.out.print("��ǰ ����>> "); 
					info=sc.next();
					System.out.print("������>> "); 
					maker=sc.next();
					System.out.print("����>> "); 
					price=sc.next();
					System.out.print("ȸȭå����>> "); 
					String title1=sc.next();
					System.out.print("����>> "); 
					String author1=sc.next();
					System.out.print("ISBN>> "); 
					String isbn1=sc.next();

					p[count]=new Conversation(id, info, maker, price, title1, author1, isbn1);
					p[count].show();
					count++; 
					break;
				}
			}
			else if (main_choice==2) { // ��ǰ ��ȸ
				for (int i=0; i<count; i++ ) {
					p[i].show();
				}
			}
			else if (main_choice==3) {
				System.exit(0);
			}
		}
	}
 }
