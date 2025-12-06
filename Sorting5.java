package ArrayProgram;
import java.util.Arrays;

public class Sorting5 {
    public static void main(String[] args) {
        int[] x={2,7,5,3,9,10,6,8,12,4,};

        Arrays.sort(x,0,x.length/2);
        for(int i=0; i<x.length; i++){
        System.out.println(x[i]);
        }
    }
}
