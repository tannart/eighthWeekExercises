import java.util.ArrayList;

public class Anagram{
	public static ArrayList<String> Anagrams =  new ArrayList<String>();
	
	public static String findRecursiveAnagrams(String word){
		
	    if(word.length() == 1){
		
			return word;			
		} else {
		
		   for(int i = 0; i < word.length(); i++){
		   
				Anagrams.add(word.charAt(i));
			}
			
			assertEquals(result);
		}
	}
}