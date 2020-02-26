
class Implementation implements SortChallenge {

	private int array[];
    private int length;
    
	public int[] simpleSort(int[] list, boolean ascending) {
        int[] input = list;
        sort(input,ascending);
        return input;
	}

	public void printSortedFrequency(int[] list) {
		int occurrenceCounter=1;
		//loop thru the sorted array and check if the current # is different with the next #,
		//if yes, then display the occurrence number.
		for(int i = 0; i< list.length; i++){
			if((i+1)<list.length){
				if(list[i]==list[i+1]){
					occurrenceCounter++; //if current # is the same as next #, then ++ the occurrenceCounter
				}else if(list[i]!=list[i+1]){
					System.out.println(list[i]+" appears "+ occurrenceCounter + (occurrenceCounter > 1 ? " times" : " time"));
					occurrenceCounter=1;
				}//end if
			}else{
				System.out.println(list[i]+" appears "+ occurrenceCounter + (occurrenceCounter > 1 ? " times" : " time"));
			}//end
		}//end for		
	}//end printSortedFrequency

	public int numberOfUniqueValues(int[] list) {
		int numberOfUniqueValues=0;
		int occurrenceCounter=1;
		//loop thru the sorted array and check if the current # is different with the next #,
		//if yes, then display the occurrence number.
		for(int i = 0; i< list.length; i++){
			if((i+1)<list.length){
				if(list[i]==list[i+1]){
					occurrenceCounter++; //if current # is the same as next #, then ++ the occurrenceCounter
				}else if(list[i]!=list[i+1]){
					if(occurrenceCounter==1){
						numberOfUniqueValues++;
					}//end if
					occurrenceCounter=1;
				}//end if
			}else{
				if(occurrenceCounter==1){
					numberOfUniqueValues++;
				}//end if
			}//end
		}//end for		
		return numberOfUniqueValues;
	}//end numberOfUniqueValues

  	public void sort(int[] inputArr, boolean ascending) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        qSort(0, length - 1, ascending);
    }//end sort
 
    private void qSort(int lowerIndex, int higherIndex, boolean ascending) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, we are setting pivot = middle index number
	    int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	    // Divide into 2 arrays
	    while (i <= j) {	       
        	if(ascending==true){
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
        	}else if(ascending==false){
                while (array[i] > pivot) {
                    i++;
                }
                while (array[j] < pivot) {
                    j--;
                }        		
        	}//end if
	        if (i <= j) {
	        	swapNumbers(i, j);
	            i++;
	            j--;
	        }
	    }
	    // call qSort() method recursively
        if (lowerIndex < j)
        	qSort(lowerIndex, j, ascending);
        if (i < higherIndex)
        	qSort(i, higherIndex, ascending);
    }//qSort
 
    private void swapNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }//end exchangeNumbers
	     
	
	
}
