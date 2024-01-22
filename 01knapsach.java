
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int val[] = new int[]{5,4,8,6};
		int wt[]= new int[]{1,2,4,5};
		int w= 5;
		int size = val.length-1;
		int maxprofit = knapsack(wt,val,w,size, new int[w+1][size+1]);
		System.out.println(maxprofit);
		
		
		
	}
	public static int knapsack(int wt[],int val[],int w, int size, int dp[][]){
	    //base Cond
	    if(w==0|size==-1)
	        return 0;
	        if(dp[w][size]>0)
	            return dp[w][size];
	    
	    //choice 
	    if(w<wt[size])
	         return knapsack(wt,val,w,size-1,dp);
	   else if(w>=wt[size]){
	      
	      dp[w][size]=  maxof(val[size]+knapsack(wt,val,w-wt[size],size-1,dp), knapsack(wt,val,w,size-1,dp));
	       return dp[w][size];
	   }
	   return 0;
	}
	
	public static int maxof(int a,int b){
	    return a>b?a:b;
	}
}
