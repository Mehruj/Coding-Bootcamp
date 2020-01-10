package BasicProblems;

public class BasicProblem16 {
	  public int[] twoLargest(int [] nums) {
		  if(nums==null ||nums.length<3) {
			  return nums;
		  }
		  int bigger= nums[0]> nums[1]?nums[0]: nums[1];
		  int big =nums[0]<nums[1]? nums[0]:nums[1];
		  for(int i=0; i<nums.length; i++) {
			  if(nums[i]> bigger) {
				  big= bigger;
				  bigger= nums[i];
			  }
			  else if(nums[i]>big) {
				  big= nums[i];
			  }
		  }
		  int out[]= new int[2];
		  out[0]=big;
		  out[1]= bigger;
		  return out;
	  }

}
