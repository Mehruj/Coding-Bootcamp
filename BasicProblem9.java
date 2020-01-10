package BasicProblems;

public class BasicProblem9 {
     public int[] Swapends(int[] nums) {
    	 if(nums==null || nums.length< 2 ) {
    		 return nums;
    	 }
    		 int temp= nums[0];
    		 nums[0]= nums[nums.length-1];
    		 nums[nums.length-1]=temp;
    		 return nums;
     }
}
