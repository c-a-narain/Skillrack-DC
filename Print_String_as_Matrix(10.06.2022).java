//Print String as Matrix
//A string S is passed as the input and the input string must be printed as a matrix of C columns where each column contains an alphabet.

import java.util.*;
public class Print_String_as_Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        char[] arr = s.toCharArray();
        int i=0,c=0;
        while(i<arr.length){
            System.out.print(arr[i]);
            c++;
            if(c%n==0){
                System.out.println();
            }
            i++;
        }
    }
}
