// selection sort=>compare and swap
public class q1{
  public static void selectionsort(int[]arr) {
    	 for(int i=0;i<arr.length;i++) {
    		 int minIndex=i;
    		 for(int j=i+1;j<arr.length;j++) {
    			 
    			 if(arr[j]<arr[minIndex]) {
    				 minIndex=j;
    			 }
    		 }
    	 
	    	 if(i!=minIndex) {
	    		 int temp=arr[i];
	    		 arr[i]=arr[minIndex];
	    		 arr[minIndex]=temp;
    	     }
    	 }
     }
  public static void main(String[] args) {
		
		int[]myarray= {5,9,4,8,1,3,2,6,7,99};
		System.out.println("The unsorted array is:"+Arrays.toString(myarray));
		selectionsort(myarray);
		System.out.println("The sorted array is:"+Arrays.toString(myarray));
  }
}
