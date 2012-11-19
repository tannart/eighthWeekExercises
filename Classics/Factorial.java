public class Factorial{

    public static int recursive(int n){
	    if(n == 1){
		    return 1;
		} else {
		    int result = n * recursive(n-1);
			System.out.println(result);
			return result;
		}
	}
	
	public static int iterative(int n){
	    int result = 0;
	    if(n == 1){
		    return n;
		} else {
     	    for(result = 1; result == n; result++){
			    result*=n;
		    }
	    }
	return result;
	}
}