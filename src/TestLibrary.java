import java.util.Scanner;

public class TestLibrary {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int option; Library lb=new Library();  int intTemp; String StringTemp;
			
			System.out.println("**********************************************************************");
			System.out.println("*		Welcome to KSU Library :)");
			System.out.println("*		---------------------------");
			
			do {
				System.out.println("*	 Please enter one of the following options:");
				System.out.println("*	1) Add a book");
				System.out.println("*	2) Delete a book");
				System.out.println("*	3) Find a book");
				System.out.println("*	4) List all books");
				System.out.println("*	5) List books for a given genre");
				System.out.println("*	6) Number of books for a give author");
				System.out.println("*	7) Total number of books");
				System.out.println("*	8) Exit");
				System.out.println("**********************************************************************");
			    System.out.print("Enter option :> ");
			    option=input.nextInt();
			    
			    switch(option) {
			    
			    case 1: 
			    	System.out.println("Please, enter the book details #ISBN, author, title, and genre");
			    	if(lb.addBook(input.nextInt(), input.next() , input.next(), input.next() ) )
			    	System.out.println("The book is added sucsesfully");
			    	else
			    		System.out.println("Please, check if book was added before or wrong ISBN");
			    	break;
			    case 2:
			    	System.out.println("Please, enter the #ISBN that you wish to delete.");
			    	lb.deleteBook(input.nextInt());
			    	System.out.println("Done deleting.");
			    	
			    	break;
			    case 3:
			    	System.out.println("Please, enter #ISBN of the book you seek for.");
			    	intTemp=input.nextInt();
			    	if(lb.findBook(intTemp)==-1)
			    		System.out.println("Book was not found...");
			    	else
			    		System.out.println("Book number "+intTemp+" was found in index "+lb.findBook(intTemp));
			    	break;
			    	
			    	
			    case 4:
			    	lb.printAll();
			    	
			    	break;
			    	
			    case 5:
			    	System.out.println("Please, enter the genre you seek.");
			    	lb.printGenre(input.next());
			    	
			    	break;
			    	
			    case 6:
			    	System.out.println("Please, enter the author name.");
			    	StringTemp=input.next();
			    	
			    	System.out.println("The author: "+StringTemp+" has "+lb.getNumberOfBooksByAuthor(StringTemp)+"  book/s");
			    	
			    	break;
			    	
			    case 7:
			    	System.out.println("There are "+lb.getNumberOfBooks()+" book/s");
			    }
			
		
			}while(option!=8);
      System.out.println("Thanks. Goodbye!");

		}
	}


	

