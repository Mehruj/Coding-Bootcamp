package BasicProblems;

public class BasicProblem10 {
	 public boolean isPalindrome(int[] nums) {
		 if(nums= null || nums.length<2) {
			 return true;
		 }
		 int end= nums.length -1;
		 for(int i=0; i< nums.length/2 ; i++) {
			 if(nums[i]!= nums[end-i]) {
				 return false;
			 }
		 }
		 return true;
	 }

}
