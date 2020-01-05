package BasicProblems;

public class BasicProblem12 {
     public int[] sumOfArrays(int[] x, int[]y) {
    	 if(x==null && y==null) {
    		 return null;
    	 }
    	 if(x==null) {
    		 return y;
    	 }
    	 if(y== null) {
    		 return x;
    	 }
    	 int max=Math.max(x.length,  y.length);
    	 int min= Math.min(x.length, y.length);
    	 int sum[]=new int[max];
    	 for(int i=0; i< min; i++) {
    		 sum[i]=x[i]+y[i];
    	 }
    	 for(int i=max ;i<max; i++) {
    		 if(x.length< y.length) {
    			 sum[i]=y[i];
    		 }
    		 else sum[i]=x[i];
    	 }
    	 return sum;
     }
}
