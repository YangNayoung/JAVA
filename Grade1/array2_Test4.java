// C언어 방과후 책 445p. 12번

class array2_Test4 {
	public static void main(String ar[]) {
		int a[][]={
		{78,48,78,98},
		{99,92,83,29},
		{29,64,83,89},
		{34,78,92,56}
	  };
	  int row[];
	  row=new int[4];
	  int column[]=new int[4];
	  int total=0;	
	  for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				row[i]+=a[i][j];
				column[i]+=a[j][i];	
				total+=a[i][j];
			}
	  }
	  System.out.println("가로의 합 : ");
	  for(int i=0; i<a.length; i++) {
			System.out.println((i+1)+"행 "+row[i]);	
	  }
	  System.out.println("세로의 합 : ");
	  for(int i=0; i<a.length; i++) {
		  System.out.println((i+1)+"열 "+column[i]);
	  }
	  System.out.println("총합 : "+total);
	}
}
