public class Paper{
 int size1 = 841;
 int size2 = 1189;

	public String getSize(String paper){
		int size;
		String paperSize;
		String firstNum;
		String secondNum;
 		int sizeHolder = 0;

 		if(paper.length() == 2 && paper.charAt(1) == '0'){

 			sizeHolder = size1*2;
			size1 = size2;
			size2 = sizeHolder;

			paperSize = size1 + "mm x " + size2 + "mm";
	    	return paperSize;
	    	
 		}else if(paper.length() > 2){

			sizeHolder = size1*2;
			size1 = size2;
			size2 = sizeHolder;

			System.out.println(sizeHolder);

			return getSize(paper.substring(0,(paper.length()-1)));

		} else {

			size = Integer.parseInt(paper.substring(1));	


			for(int i = size ; i > 0; i--){

				sizeHolder = size2/2;
				size2 = size1;
				size1 = sizeHolder;
				System.out.println(sizeHolder);
			}

		paperSize = size1 + "mm x " + size2 + "mm";
	    return paperSize;

		}	
	}
}