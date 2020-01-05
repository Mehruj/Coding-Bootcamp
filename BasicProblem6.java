package BasicProblems;

public class BasicProblem6 {
       public int countEven(int[] nums) {
    	   int count=0;
    	   for(int i=0;i<nums.length; i++) {
    		   if(nums[i]%2==0) {
    			   count++;
    		   }
    	   }
    	   return count;
       }
}
