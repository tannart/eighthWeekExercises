public class Palindrome{

	String word;
    
	public static String isRecursivePalindrome(String word){
		if(word.length() == 1){
		    return word;
		} else {
			String letterHolder = String.toString(word.charAt(0));
			return isRecursivePalindrome(word.substring(1)) + letterHolder;
		}
	}
	
	public String isPalindrome(String word){
	    String backword = isRecursivePalindrome(word);
		
		if(backword == word){		
		
			System.out.println(backword + " is the same as " + word + " congratulations, you now have a palindrome");
			System.out.println("");
			
		} else {
		
			System.out.println(backword + " is not the same as " + word + " you fool, no palindrome for you");
			System.out.println("");
		}
		
		return backword;
	}
}