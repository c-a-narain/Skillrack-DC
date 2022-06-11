//Append N Strings
//N string values are passed as input. The program must append the N strings in the reverse order and print the single string as the output.
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i=0;i<n;i++){
		    s[i]=sc.next();
		}
		for(int i=n-1;i>=0;i--){
		    System.out.print(s[i]);
		}
	}
}
