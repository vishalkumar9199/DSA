
public class factoria {
    public static int factorial(int n) {
    	if(n==1) return 1;
    	return n*factorial(n-1);
    }
	public static void main(String[] args) {
		int my_fact=factorial(4);
		System.out.println(my_fact);

	}

}
