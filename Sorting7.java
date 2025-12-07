package ArrayProgram;
// sorting character in ascending order and convert it in to char type.
import java.util.Arrays;
public class Sorting7 {
 public static void main(String[] args) {
       int x[]={'a','Z','Q','s','T','w','B','U'};
       System.out.println(Arrays.toString(x));
       System.out.println("===========");
       Arrays.sort(x);
       for(int i=0; i<x.length; i++)
       {
        char ch=(char)x[i];
        System.out.println(ch);
       }

    }
}

