class Song {
	String title;
	String artist;
	String albom;
	String composer[] = new String [3];
	int year;
	int track;
	
	Song() {}
	Song(String title, String artist, String albom, String composer[], int year, int track){
		this.title=title;
		this.artist=artist;
		this.albom=albom;
		for( int i=0; i<3; i++) 
			this.composer[i]=composer[i];
		this.year=year;
		this.track=track;
	}
	public void show() {
		System.out.println("�뷡 ����: "+ title);
		System.out.println("����: "+ artist);
		System.out.println("�ٹ�: "+ albom);
		for (int i=0; i<3 ;i++ )
		{
			System.out.println("�۰: "+ composer[i]);
		}
		System.out.println("�⵵: "+ year);
		System.out.println("Ʈ�� ��ȣ: "+ track);
	}

	public static void main(String ar[]) {
		Song s1=new Song();
		Song s2=new Song("ABBA","Dancing Queen", "Arrival", new String [] {"Benny Andersson","Bjorn Ulvaeus","Stig Anderson"}, 1976, 2);

		s2.show();
			}
}