import java.util.Arrays;
public class Bubblesort {

  // BubbleSort method..
     public static void bubblesort(int arr[]) {
    	 for(int i=arr.length-1;i>0;i--) {
    		 for(int j=0;j<i;j++) {
    			 if(arr[j]>arr[j+1]) {
    				 int temp=arr[j];
    				 arr[j]=arr[j+1];
    				 arr[j+1]=temp;
    			 }
    		 }
    	 }
     }
     
     
	public static void main(String[] args) {
		
		int[]myarray= {5,9,4,8,1,3,2,6,7,99};
		System.out.println("The unsorted array is:"+Arrays.toString(myarray));
		bubblesort(myarray);
		System.out.println("The sorted array is:"+Arrays.toString(myarray));

}
}
