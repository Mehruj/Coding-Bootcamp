package BasicProblems;

public class BasicProblem20 {
	public int[] sumZero(int n) {
		int[]out= new int[n];
		for(int i=0; i< n/2; i++) {
			out[i*2]= -n-i;
			out[i*2+1]= n+i;
		}
		if(n%2==1) {
			out[n-1]=0;
		}
		return out;
	}

}