package BasicProblems;

public class BasicProblem13 {
	public int[] moveElements(int[] nums) {
		if(nums==null || nums.length==0) {
			return nums;
		}
		int index=0;
		int out[]= new int [nums.length];
		for(int i=0; i<nums.length; i++) {
			out[index]= nums[i];
			index++;
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				out[index++]= nums[i];
			}
		}
		return out;
	}

}
