import java.util.Scanner;
import java.util.regex.Pattern;


public class inputHandler extends Initializer {
	
Scanner input2 = new Scanner(System.in);

	public inputHandler() 
	{
	}
	/**
	 * Method for adding a new word to the dictionary. 
	 * references the isValidString() method to check
	 * if both the word and definition are valid Strings.
	 * 
	 */
	public void addWord()
	{
		System.out.println("Enter the word you would like to add:");
		String newWord = input2.next();
		
		
		if(isValidString(newWord))
		{
			Word wd = new Word(newWord);
			
			System.out.println("Enter the definition of " + newWord);
			String wdDef = input2.next();
			
				if(isValidString(wdDef))
				{
					wd.setDefinition(wdDef);
					dic.getWords().add(wd);
				
				} else System.out.println("This is not a valid definition. Try again. ");
			
		} else System.out.println(newWord + " is not a valid word.");
		
		System.out.println(newWord  + " successfully added.");
		
	}  // CLOSES ADD WORD
	
	
	// Handler for the button press to print dictionary. 
	public void printDictionary()
	{
		dic.printAll();
	}
	
	
	public void addSynonyms()
	{
		
		//Add a synonym to a word in the dictionary. 
		//Both the synonym and the word should already be present in the dictionary.
		
		System.out.println("Enter the word you would like to add a synonym to: ");
		String word = input2.next();
	
		if(isValidString(word) && dic.contains(word))
		{
			System.out.println("Enter the Synonym you would like to add.");
			String newsyn = input2.next();
			
			if(isValidString(newsyn) && dic.contains(newsyn)){
				int addindex = dic.indexOf(word);
				dic.getWords().get(addindex).addSynonyms(newsyn);
			}
		
		}
	}
	
	public void printSynonyms()
	{
		System.out.println("Enter the word you want to print variables for: ");
		String printsyn = input2.next();
		
		if(dic.contains(printsyn))
		{	
			int w = dic.indexOf(printsyn);
			dic.getWords().get(w).printSynonyms();		
		}
		
	}
	
	/**
	 * 
	 * @param wd
	 * @param wdDef
	 * @return
	 * 
	 * Checks if a string is a valid string using regex.
	 * 
	 */


	
	public  boolean isValidString(String inputWord)
	{
		if(! Pattern.matches(".*[a-zA-Z]+.*", inputWord))
		{
			return false;
		}
		return true;
	}

}
