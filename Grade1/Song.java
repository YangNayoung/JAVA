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
		System.out.println("노래 제목: "+ title);
		System.out.println("가수: "+ artist);
		System.out.println("앨범: "+ albom);
		for (int i=0; i<3 ;i++ )
		{
			System.out.println("작곡가: "+ composer[i]);
		}
		System.out.println("년도: "+ year);
		System.out.println("트랙 번호: "+ track);
	}

	public static void main(String ar[]) {
		Song s1=new Song();
		Song s2=new Song("ABBA","Dancing Queen", "Arrival", new String [] {"Benny Andersson","Bjorn Ulvaeus","Stig Anderson"}, 1976, 2);

		s2.show();
			}
}