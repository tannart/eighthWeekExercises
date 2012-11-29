import java.util.*;


public class Main{
	
	public static void main(String[] args){

		BinarySort test = new BinarySort();

		List<Integer> testList = test.makeList(100);

		test.sortList(900, testList, 0, 100);
	}
}