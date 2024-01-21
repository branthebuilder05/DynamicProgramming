
public class fibonachi
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		long n = fib(50,new long[51]);
			System.out.println(n);
		
	}
	
	public static long fib(int n, long stored[]){
	    if(n<=1)
	        return n;
	   // if(stored[n]>0)
	   //     return stored[n];
	    else{
	        stored[n]= fib(n-1,stored)+fib(n-2,stored);
	        return stored[n];
	    }
	}
}
