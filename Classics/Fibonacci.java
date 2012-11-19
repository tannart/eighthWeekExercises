public class Fibonacci{

    public static int iterative(int n){
		int result = 0;
	
		int current = 1;
		int previous = 0;
	    for(int i = 0; i < n; i++){
		    result = current + previous;
			previous = current;
			current = result;
			//System.out.println(result);
		}
		return result;
	}
	
	public static int recursive(int n){
	    if(n==1 || n ==2){
		    return 1;
		} else {
		}
		return 0;
	}
		
}