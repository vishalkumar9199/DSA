import java.util.Arrays;

public class MergeSort {

// Merge helper method

	public static int[]merge(int[]arr1,int[]arr2){
		int[]combined=new int[arr1.length+arr2.length];
		int index=0;
		int i=0;
		int j=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				combined[index]=arr1[i];
				index++;
				i++;
			}else {
				combined[index]=arr2[j];
				index++;
				j++;
			}
			
		}
			while(i<arr1.length) {
				combined[index]=arr1[i];
				index++;
				i++;
			}
			while(j<arr2.length) {
				combined[index]=arr2[j];
				index++;
				j++;
			}
			return combined;
		}
// MergeSort method

	public static int[]mergesort(int[]array){
		if(array.length==1) return array;
		
		int minIndex=array.length/2;
		int[]left=mergesort(Arrays.copyOfRange(array,0 ,minIndex));
		int[]right=mergesort(Arrays.copyOfRange(array,minIndex,array.length));
		
		return merge(left,right);
		
	}



	public static void main(String[] args) {

		// TODO Auto-generated method stub
  int []originalArray= {1,10,39,14,25,3,4,5};
  int[]sortedArray=mergesort(originalArray);
  System.out.println("Original Array:"+Arrays.toString(originalArray));
  System.out.println("Sorted Array:"+Arrays.toString(sortedArray));
		int arr1[]= {1,2,4,6,7};
		int arr2[]= {11,15,17,19,20};
		;
		System.out.println(Arrays.toString(merge(arr1,arr2)));
  
	}

}
