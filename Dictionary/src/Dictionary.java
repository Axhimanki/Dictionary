import java.util.ArrayList;

/**
 * 
 */

/**
 * @author 
 * 
 *
 */
public class Dictionary {

	private ArrayList <Word> words; 
	
	/**
	 *  Construct empty dictionary
	 *  
	 */
	
	public Dictionary()
	{
		words = new ArrayList <Word>();
	}
	
	
	/*
	 * 
	 * Getter/Setter
	 * 
	 */
	
	
	/**
	 * PRINTS ALL OF THE WORDS IN THE DICTIONARY THUS FAR. 
	 * 
	 */
	
	public void printAll()
	{
		System.out.println("");
		int g = 0; 
		
		if(words.size()==0)
		{
			System.out.println("This dictionary contains no words. Try again.");
			
		} else { 
			
			while(g<words.size())
			{
				System.out.println(g+1 + ")" + words.get(g).getWord() );
				
				g++;
			}
			System.out.println("");
		}
	}
	
	public boolean contains(String k){
		int g = 0; 
		while(g<words.size())
		{
			if(words.get(g).getWord().equals(k)==true){
				return true;
			}
			g++;
		}
		return false;
	}
	
	
	public int indexOf(String str){
		int g  = 0;
		while(g<words.size()){
			if(words.get(g).equals(str))
			{
				
				return g;
				
			}
			g++;
		} 
		return -1;
	}
	
	public ArrayList<Word> getWords() {
		return words;
	}
	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}

}
