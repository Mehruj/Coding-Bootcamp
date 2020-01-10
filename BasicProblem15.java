package BasicProblems;

public class BasicProblem15 {
	public int duplicateNumber(int [] nums) {
		if(nums==null || nums.length<2) {
			return 0;
		}
		int n= nums.length-1;
		int sum1=(n*(n+1))/2;
		int sum2= 0;
		for(int i=0; i<nums.length;i++) {
			sum2+= nums[i];
		}
		int duplicateName= sum2-sum1;
		return duplicateName;
		}

}
