import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTester{
    
	@Before
    public void buildUp(){
        ArrayList<String> Anagrams =  new ArrayList<String>();
		
    }
	
	@Test
	public static String findRecursiveAnagrams(String word){
		String word = "drag";
		for(int i = 0; i < word.length()-1; i++){
			Anagrams.add(word.charAt(i));
		}
		assertEquals(result);
	}
	
	@Test
	public void findRecursiveAnagrams(){
		String word = "o";
		String result = "a";
		
	    if(word.length() == 1){
			result = word;   
		}
	    assertEquals(result,word);
	}
	
}