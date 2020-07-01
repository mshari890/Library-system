import java.util.Scanner;
import java.util.Random;
public class Hangman {
	
	String[] words={"program","java","csc111"};
    char[] hiddenWord;
    char[] guessedWord;
    
    public Scanner input=new Scanner(System.in);
    
    public Hangman() {
    	
    	String word=pickWord();
    	guessedWord=new char[word.length()];
    	for(int i=0 ; i<word.length() ; i++)
    		guessedWord[i]='*';
    	
    	hiddenWord=new char[word.length()];
    	for(int i=0 ; i<word.length() ; i++)
    		hiddenWord[i]=word.charAt(i);	
    }
    
    private int indexOf(char c) {
    	for(int i=0 ; i<hiddenWord.length ; i++)
    		if(hiddenWord[i]==c)
    			return i;
    	
    	return -1;
    }
    
    private void setCharAt(int i,char c, char[] arr) {
    	arr[i]=c;
    }
    
    private String pickWord() {
    	Random rand=new Random();
    	int n=rand.nextInt((words.length));
    	return words[n];    	
    }
    
    private void copyStringToArray(String word) {
		hiddenWord=word.toCharArray();
		
		
    }
    
    private void printWord() {
    	for(int i=0 ; i<guessedWord.length ; i++)
    		System.out.print(guessedWord[i]);
    }
    
    private boolean isComplete() {
    for(int i=0 ; i<guessedWord.length ; i++)
    	if(guessedWord[i]=='*' && guessedWord[i]==hiddenWord[i])
    		return false;
    		
    return true;
    
    
    }
    
    private void playOneRound() {
    	String temp=pickWord();
    	int numMisses=0;
    	copyStringToArray(temp);
    	guessedWord=new char[temp.length()];
    	for(int i=0 ; i<temp.length(); i++)
    		guessedWord[i]='*';
    	
    	while(true) {
    		if(isComplete()) {
    		System.out.println("The word is "+ temp+ ". You missed " +numMisses+ " time");
    		break;
    		}
    		System.out.print("(Guess) Enter a letter in word> "); printWord();
    		 char temp1=input.next().charAt(0);
    		 System.out.println();
    		
    		       if( indexOf(temp1) ==-1)
    		           {System.out.println(temp1+" is not in the word");numMisses++;}
    		       else {
    		    	   for(int i=0 ; i<hiddenWord.length ; i++)
    		    		   if(hiddenWord[i]==temp1) {
    		    			   setCharAt(i,temp1,guessedWord); setCharAt(i,'$',hiddenWord);
    		    		   }
    		       }
    	}
    }

	public void play() {
		System.out.println("Welcome to Hangman game. Are you ready? OK lets go!");
		String Done;
		boolean done=false;
		while(!done) {
			playOneRound();
			System.out.println("Do you want to guess another word? Enter y or n>");
			done=true; Done=input.next();
			if(Done.equalsIgnoreCase("y"))
				done=false; if(Done.equalsIgnoreCase("n"))
					                   done=true;
		}
		System.out.println("Goodbye!");
	}
	
	public String[] getWords() {
		return words;
	}
	
	public char[] getHiddenWord() {
		return hiddenWord;
	}
	 
    
}
