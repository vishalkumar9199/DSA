import java.util.Arrays;

public class QuickSort {
	
//	   Swap method
	
	public static void swap(int[]array,int firstIndex,int secondIndex) {
		int temp=array[firstIndex];
		array[firstIndex]=array[secondIndex];
		array[secondIndex]=temp;
	}
//	pivot method
	
	private static int pivot(int[]array,int pivotIndex,int endIndex) {
		int swapIndex=pivotIndex;
		for(int i=pivotIndex+1;i<=endIndex;i++) {
			if(array[i]<array[pivotIndex]) {
				swapIndex++;
				swap(array,swapIndex,i);
			}
		}
		swap(array,pivotIndex,swapIndex);
		return swapIndex;
	}
//	quicksort method
	
	public static void quicksort(int[]array,int left,int right) {
		if(left<right) {
			int pivotIndex=pivot(array,left,right);
			quicksort(array,left,pivotIndex-1);
			quicksort(array,pivotIndex+1,right);
		}
	}
	
	
	public static void main(String[] args) {
        
    int []myarray= {4,6,1,7,3,2,5};
    
    quicksort(myarray,0,6);
    System.out.println(Arrays.toString(myarray));


	}

}
