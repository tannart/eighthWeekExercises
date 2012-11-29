public class Power{
	
	public static int pow(int base, int exponent){
		int exp = exponent;
		int result = base;

		if(exp == 1){
			return result;
		} else {
			result = result * base;
			return pow(result, exp -1);
		}
	}
}