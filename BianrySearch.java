
public class Binary {
public static int Binarysrch(int[]arr,int target) {
	int left=0;
	int right=arr.length-1;
	
	while(left<=right) {
		int mid=(left+right)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]<target) {
			left=mid+1;
		}else {
			right=mid-1;
		}
	}
		return -1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {1,2,4,6,7,11,13,16,19,20};
        int target=13;
        
        System.out.println(Binarysrch(arr,target));
	}

}
