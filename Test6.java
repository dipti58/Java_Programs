package ArrayProgram;

// 11)update 1st occurance in an array 

public class Test6 {
    public static void main(String[] args) {
        int[] a={3,4,6,2,7,9,1,2,8,5,4,2,3};
        int ol=4,nw=12;
        for(int i=0; i<a.length; i++){
            if(ol==a[i]){
                a[i]=nw;
            
            break;
            }
        }
        for(int i=0;i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
