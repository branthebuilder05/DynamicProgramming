
public class fixedjumpstair
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		long n = climbstairfixedjump(40,new long[41]);
			System.out.println(n);
		
	}
	
	public static long climbstairfixedjump(int n, long stored[]){
	    if(n<0)
	        return 0;
	           if(n==0){
	               stored[n] = 1;
	               return stored[n];
	           }
	        
	   // if(stored[n]>0)
	   //     return stored[n];
	    else{
	        stored[n]= climbstairfixedjump(n-1,stored)+climbstairfixedjump(n-2,stored) +climbstairfixedjump(n-3,stored);
	        for(long ele:stored){
	             System.out.print(ele+" ");
	            
	        }
	        System.out.println();
	        return stored[n];
	    }
	}
}
