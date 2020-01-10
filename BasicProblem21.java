
package BasicProblems;

public class BasicProblem21 {
	public char[] reverseString(char [] str) {
		for(int i=0; i< str.length; i++) {
			char x= str[i];
			str[i]=str [str.length-1-i];
			str[str.length-1-i]=x;
		}
		return str;
	}

}
