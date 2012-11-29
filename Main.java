import java.util.*;


public class Main{
	
	public static void main(String[] args){

		BinarySort test = new BinarySort();

		List<Integer> testList = test.makeList(10);

		test.sortList(56, testList, 0, 10);
	}
}