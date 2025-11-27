package ArrayProgram;

//16)find the maximum value in an array.

public class Test9 {
    public static void main(String[] args) {
        int a[]={2,3,4,2,5,6,9,7,8};
        int max=a[0];
        for(int i=1; i<a.length; i++){
            if(max<a[i]){
             max=a[i];
            }
        }
      System.out.println(max);
    }
}

