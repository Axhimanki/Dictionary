import java.util.Scanner;





public class InputReceiver extends inputHandler {
	
private inputHandler ihandler;

//Dependency Injection
	public InputReceiver() 
	{
		
		boolean runwl=true;
		
		while(runwl==true)
			
		{
			printOptions();

			
		}
	}
	
	
	
	
	public void printOptions()
	{
		char k ; 
		Scanner input = new Scanner(System.in);
		
		System.out.println(
				"A) Add a word to the Dictionary" + "\n" +
				"B) Print all of the Words of this dictionary. " + "\n" + 
				"C) Add Synonyms to a word in this dictionary" + "\n" +
				"D) Print all of the synonyms of a word. "
				
				);
		
		k = input.next().charAt(0);
		useInput(k);
		
		
	}
	
	public void useInput(char c)
	{
		if(c=='A' || c=='a'){
			addWord();
		}
		if(c=='B' || c=='b'){
			printDictionary();
		}
		if(c=='C' || c== 'c'){
			addSynonyms();
		}
		if(c=='D' || c=='d'){
			printSynonyms();
		}
	}
}
