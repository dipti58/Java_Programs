package ArrayProgram;

//10)update all occurrance in an arrays

public class Test5 {
    public static void main(String[] args) {
    int[] a={3,4,5,1,8,9,6,8,2,7};
    
     int ol=8,nw=10;
     for(int i=0; i<a.length; i++)
       {
       if(ol==a[i]){
        a[i]=nw;
       }
       System.out.println(a[i]);
       }
    }
}
