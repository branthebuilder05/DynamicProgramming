
public class varjump
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int jump[]=new int[]{3,2,2,0,3,3};
		long n = climbstairvariblejump(0,jump,new long[6+1],6);
			System.out.println(n);
		
	}
	
	public static long  climbstairvariblejump(int n,int jump[], long stored[],int fin){
	    if(n>fin)
	        return 0;
	    if(n==fin){
	               stored[n] = 1;
	               return stored[n];
	           }
	        
	    if(stored[n]>0)
	        return stored[n];
	    else{
	        
	        long span[] = new long[jump[n]];
	        for(int i=0;i<span.length;i++){
	            span[i]=climbstairvariblejump(n+i+1,jump,stored,fin);
	        }
	         for(int i=0;i<span.length;i++){
	        stored[n]+=span[i];
	             
	         } 
	       // for(long ele:stored)
	       //      System.out.print(ele+" ");
	       // System.out.println();
	        
	        return stored[n];
	    }
	}
}
