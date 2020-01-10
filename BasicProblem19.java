package BasicProblems;

public class BasicProblem19 {
	public int findNumbers(int[] nums) {
		if(nums==null) {
			return 0;
		}
		int even_counter= 0;
		for(int i=0; i< nums.length; i++) {
			int count=0;
			int x= nums[i];
		while(x!=0) {
			x/=10;
			count++;
		}
		if(count %2== 0) {
			even_counter++;
		}
		return even_counter;
		}
		
	}

}
