 public static void insertionsort(int[]arr) {
    	 for(int i=1;i<arr.length;i++) {
    		 int temp=arr[i];
    		 int j=i-1;
    		 while(j>-1 && temp<arr[j]) {
    			 arr[j+1]=arr[j];
    			 arr[j]=temp;
    			 j--;
    		 }
    		 
    	 }
     }
     
	public static void main(String[] args) {
		
		int[]myarray= {5,9,4,8,1,3,2,6,7,99};
		System.out.println("The unsorted array is:"+Arrays.toString(myarray));
		insertionsort(myarray);
		System.out.println("The sorted array is:"+Arrays.toString(myarray));

}
}
