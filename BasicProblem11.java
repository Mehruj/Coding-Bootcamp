package BasicProblems;

public class BasicProblem11 {
    public boolean isSameArrays(int[] ar1, int[] ar2) {
      if(ar1==null|| ar2== null|| ar1.length!= ar2.length) {
    	   return false;
    	  
      }
      if(ar1==null|| ar2==null) {
    	  return true;
      }
      for(int i=0; i< ar1.length; i++) {
    	  if(ar1[i]!=ar2[i]) {
    		  return false;
    	  }
      }
      return true;
    }
}
