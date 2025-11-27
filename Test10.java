package ArrayProgram;

//16)find the minimum value in an array.

public class Test10 {
    public static void main(String[] args) {
        int[] a={10,4,6,7,9,4,8,2};
        int min=a[0];
        for(int i=1; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
            }
        } 
        System.out.println(min);
    }
}

