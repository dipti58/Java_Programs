package ArrayProgram;

import java.util.Arrays;
public class Sorting6 {
    public static void main(String[] args) {
        int[] x={2,3,6,4,8,10,44,22,7,9,1,12};

        Arrays.sort(x,x.length/2,x.length);
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }
}
