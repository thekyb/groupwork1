package alphabet.symphony;

public class AlphabetArray {
	
	private char letterToArray;
	private int letterCount;
	private String [] characters = new String [26];
	//String [] characters = new String [26];
	//letterToArray = 'a';
	
	public AlphabetArray() {
		
		letterToArray = 'a';
		letterCount = 0;
		
		//Adds letters of alphabet to array
		for (int i = 0; i < characters.length; i++) {
					
			characters[i] = Character.toString(letterToArray);
			
			letterCount = (int) (letterToArray);
			
			letterCount++;
			
			letterToArray = (char) (letterCount);
			
		}
		
	}
	
	public String getLetter(int i) {
		
		return characters[i];
		
	} // getLetter()
	
	public int getLength() {
		
		return characters.length;
		
	}
	
} //Class AlphabetArray
