
public class Book {
	private int ISBN;
	private String author,title,genre,refCode;

	public Book() {}
	public Book(int ISBN,String author,String title,String genre) {
		this.ISBN=ISBN;
		this.author=author;
		this.title=title;
		this.genre=genre;
	}
	
    public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRefCode() {
		return refCode;
	}
	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public void generateReference() {
		refCode=author.substring(0,2)+"-"+genre.substring(0,2);
	}
	
	public boolean verifyISBN(int ISBN) {
	int n1,n2,n3,n4;
		
		n4=ISBN%10;
		n3=ISBN/10%10;
		n2=ISBN/100%10;
		n1=ISBN/1000%10;
		
		if((n1*3+n2*2+n3*1)%4==n4)
			return true;
		
		else return false;
	}
	
	public void printBookInfo() {
		generateReference();
	System.out.println("Title: "+title);
	System.out.println("");
	System.out.println("Author: "+author);
	System.out.println("");
	System.out.println("ISBN: "+ISBN + " - Reference Code : " + refCode);
	System.out.println("");
	System.out.println("Genre: "+genre);
	}
	
	public boolean equals(Book b) {
		if(ISBN==b.getISBN())
			return true;
		else
			return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
