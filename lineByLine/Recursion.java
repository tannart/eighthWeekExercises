public class Recursion{

    public static void printNumbers(int n){
	    if(n <=0){
		    return;
		}
		System.out.println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println(n);
	}
	
	public String doggyMethod(int n){
	    String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		if(n<=0){
		    return "";
		}
		return result;
    }
	
	public int mcCarthy91(int n){
	    if(n > 100){
		    return n - 10;
		} else {
		    return mcCarthy91(mcCarthy91(n+11));
		}
	}
}