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
		System.out.print("상품ID: "+id+" 상품 설명: "+info+" 생산자: "+maker+" 가격: "+price); 
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
		System.out.println(" 책 제목: "+title+" 저자: "+author+" ISBN: "+isbn);
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
		System.out.println(" 노래 제목: "+titlesong+" 가수: "+singer);
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
		System.out.println(" 회화책 제목: "+title1+" 저자: "+author1+" ISBN: "+isbn1);
	}
}

 class Product {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Product_1 p[]=new Product_1[10];
		int count=0; // 삽입할 상품 갯수
		
		while (true) {
			System.out.print("==상품추가[1]  상품조회[2]  끝내기[3]==> ");
			int main_choice=sc.nextInt();
			if (main_choice==1) { // 상품 추가
				System.out.print("==상품 종류-> 책[1]  음악CD[2]  회화책[3]==> ");
				int num=sc.nextInt();
				switch (num) {
					case 1: 
						System.out.print("상품 ID>> "); 
						String id=sc.next();
						System.out.print("상품 설명>> "); 
						String info=sc.next();
						System.out.print("생산자>> "); 
						String maker=sc.next();
						System.out.print("가격>> "); 
						String price=sc.next();
						System.out.print("책제목>> "); 
						String title=sc.next();
						System.out.print("저자>> "); 
						String author=sc.next();
						System.out.print("ISBN>> "); 
						String isbn=sc.next();

						p[count]=new Book(id, info, maker, price, title, author, isbn);
						p[count].show();
						count++;
						break;
				case 2: 
						System.out.print("상품 ID>> "); 
						 id=sc.next();
						System.out.print("상품 설명>> "); 
						 info=sc.next();
						System.out.print("생산자>> "); 
						 maker=sc.next();
						System.out.print("가격>> "); 
						 price=sc.next();
						System.out.print("노래 제목>> "); 
						String titlesong=sc.next();
						System.out.print("가수>> "); 
						String singer=sc.next();

						p[count]=new Music(id, info, maker, price, titlesong, singer);
						p[count].show();
						count++; 
						break;
				case 3:
					System.out.print("상품 ID>> "); 
					id=sc.next();
					System.out.print("상품 설명>> "); 
					info=sc.next();
					System.out.print("생산자>> "); 
					maker=sc.next();
					System.out.print("가격>> "); 
					price=sc.next();
					System.out.print("회화책제목>> "); 
					String title1=sc.next();
					System.out.print("저자>> "); 
					String author1=sc.next();
					System.out.print("ISBN>> "); 
					String isbn1=sc.next();

					p[count]=new Conversation(id, info, maker, price, title1, author1, isbn1);
					p[count].show();
					count++; 
					break;
				}
			}
			else if (main_choice==2) { // 상품 조회
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
