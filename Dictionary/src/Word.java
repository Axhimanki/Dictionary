import java.util.ArrayList;
public class Word {
	
	
	private String word; 
	private String definition; 
	private ArrayList<String> synonyms; 
	
	public Word() {
		
	}
	
	public Word(String word, String definition, ArrayList<String> synonyms) 
	{
		
		super();
		this.word = word;
		this.definition = definition;
		this.synonyms = synonyms;
		
	}
	
	/*
	 * Getters and Setters
	 * 
	 */

	


	public Word(String newWord) {
		this.word = newWord;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public ArrayList<String> getSynonyms() {
		return synonyms;
	}

	public void addSynonyms(String newsyn) {
		synonyms.add(newsyn);
	}
	public void printSynonyms(){
		int g = 0;
		while(g<synonyms.size()){
			System.out.println(synonyms.indexOf(g));
			g++;
		}
	}

}
