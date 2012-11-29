import java.util.*;

public class BinarySort{

	private List<Integer> theList;

	public List<Integer> makeList(int num){

		int[] holder = new int[num];

		for(int i = 0; i < num; i++){
			int g = (int) Math.abs(num * Math.random());
			holder[i] = g;
		}

		theList = new ArrayList<Integer>(num);

		
		int arrayHolder = num+1;

		for(int i = 0; i < num; i++){

			int temp = num+1;

			for(int f = 0; f < num; f++){
				if(holder[f] < temp){
					temp = holder[f];
					arrayHolder = f;
				}
			}

			holder[arrayHolder] = 100000;
			theList.add(temp);
		}
		return theList;
	}

	public int sortList(int num, List<Integer> aList, int low, int high){
		int middle = 0;

		if(aList.equals(null)){

			System.out.println("This list is empty!");

		} else {

			middle = (high + low)/2;

			System.out.println(aList.get(middle));

			if(aList.get(middle) == num) {

				System.out.println("Your Number Has Been Found !!");
				return middle;

			} else if(middle == high || middle == low){
				System.out.println("Your number does not appear to be here");

				return middle;
			}

			if(aList.get(middle) > num){

				System.out.println("Going Lower");

				return sortList(num, aList, low, high-1);

			} else if(aList.get(middle) < num){

				System.out.println("Going Higher");

				return sortList(num, aList, low+1, high);

			} 
		}
		return middle;
	}
}




