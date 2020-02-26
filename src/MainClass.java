import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClass {

	public static void main(String[] args) {
        /*
		Implementation imp = new Implementation(); 
        int list[] = { 24, 12, 8, 12, 19 };
        */
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int arraySize;
		try {
			//the first # is how many # user going to enter
			//e.g. if the 1st # is 5, then user is going to enter 5 number
			//each one followed by an ENTER, after user entered the 5th number
			//it will automatically call the sort function
			
			System.out.println("How many number(s) you going to enter ?"); 
			arraySize = Integer.parseInt(R.readLine());
			
			System.out.println("Enter 1 if you want to sort in ascending order, Enter anything other 1 means you want to sort in dscending order."); 			
			
			boolean ascending = false;
			if("1".equals(R.readLine())){
				ascending = true;
			}else{
				ascending = false;				
			}//end if

			System.out.println("Please enter "+arraySize+" number followed by the ENTER key"); 			
			System.out.println(); 

	        int[] arrayInput = new int[arraySize];
	        for (int i = 0; i < arraySize; i++) {
	            arrayInput[i] = Integer.parseInt(R.readLine());
	        }//end for
	        
			Implementation imp = new Implementation(); 
			arrayInput = imp.simpleSort(arrayInput,ascending);

	        for (int j = 0; j < arrayInput.length; j++) {
	            System.out.println(arrayInput[j]);
	        }//end for
	        
			System.out.println("Now printing occurence of each number you entered:"); 
			System.out.println(); 

					
	        imp.printSortedFrequency(arrayInput);
	        
			System.out.println(); 	        
			System.out.println("Number of Unique Value(s): "+imp.numberOfUniqueValues(arrayInput)); 

	        
		} catch (Exception e) {
			e.printStackTrace();
		}//end try catch


	}

}
