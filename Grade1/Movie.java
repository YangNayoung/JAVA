class Movie {
	public String title;
	public String director;
	public String manufacturer;
	
	Movie (String title, String director, String manufacturer) {
		this.title=title;
		this.director=director;
		this.manufacturer=manufacturer;
	}
	Movie (String title, String director) {
		this.title=title;
		this.director=director;
	}
}