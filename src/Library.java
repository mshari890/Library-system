
public class Library {

	private Book[] libraryBooks;
	private int numOfBooks;
	public static final int MAX_SIZE=100;
	
	public Library() {
		libraryBooks=new Book[MAX_SIZE];
		numOfBooks=0;
	}
	

	public boolean addBook(int ISBN,String author,String title,String genre) {
		Book b=new Book(ISBN,author,title,genre);
		
		if(b.verifyISBN(ISBN)) {
			if(findBook(ISBN)==-1) {
				libraryBooks[numOfBooks]=b;
				numOfBooks++;
				return true;
			}
				
			else 
				return false;
		}
			return false;
	}
	
	
	public boolean addBook(Book b) {
		if(b.verifyISBN(b.getISBN())) {
			if(findBook(b)==-1) {
			libraryBooks[numOfBooks]=b;
			numOfBooks++;
			return true;
			}
			else
				return false;
			
		
		
		
		}
		else 
			return false;
	}
	
	
	
	public void deleteBook(int ISBN) {
		
		for(int i=0;i<libraryBooks.length;i++) {
			if(libraryBooks[i]!=null)
			if(libraryBooks[i].getISBN()==ISBN) {
				
				libraryBooks[i]=libraryBooks[numOfBooks];
				
				libraryBooks[numOfBooks]=null;
				numOfBooks--;}}
	}
	
	public int findBook(int ISBN) {
		if(libraryBooks[0]!=null) {
		
		for(int i=0;i<libraryBooks.length;i++) {
			if(libraryBooks[i]!=null)
			if(libraryBooks[i].getISBN()==ISBN)
				return i;}}
			
				return -1;
	}

	public int findBook(Book b) {
		for(int i=0;i<libraryBooks.length;i++)
			if(libraryBooks[i].equals(b))
				return i;
		
		return -1;
	}
	
	public void printAll() {
		for(int i=0;i<libraryBooks.length;i++)
			if(libraryBooks[i]!=null)
			libraryBooks[i].printBookInfo();
	}
	
	public void printGenre(String g) {
		for(int i=0;i<libraryBooks.length;i++) {
			if(libraryBooks[i]!=null)
			if(libraryBooks[i].getGenre().equalsIgnoreCase(g))
				libraryBooks[i].printBookInfo();}
	}
	
	public int getNumberOfBooksByAuthor(String a) {
		int num=0;
		for(int i=0;i<libraryBooks.length;i++) {
			if(libraryBooks[i]!=null)
			if(libraryBooks[i].getAuthor().equalsIgnoreCase(a))
				num++;}
		
		return num;
	}
	
	public int getNumberOfBooks() {
		return numOfBooks;
	}
	
	public Book[] getLibraryBooks() {
		return libraryBooks;
	}
	
	public void setNumOfBooks(int n) {
		numOfBooks=n;
	}
	
	
	

	
}
