package BasicProblems;

public class BasicProblem14 {
	public int missingNumber(int[]nums) {
	int sum=0;
	for(int i=0; i<nums.length; i++) {
	     sum+= nums[i];
	}
	int totalSum= ((nums.length +1)*(nums.length+2))/2;
	return totalSum-sum;
	}

}
