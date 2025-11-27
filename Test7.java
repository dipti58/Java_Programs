package ArrayProgram;
   import java.util.Scanner;

public class Test7 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array number");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Insert an array");
        for(int i=0 ; i<size ; i++){
            a[i]=sc.nextInt();
        }
        int ol,nw;
        System.out.println("enter old element");
        ol=sc.nextInt();
        System.out.println("enter new element");
        nw=sc.nextInt();
        for(int i=0;i<a.length; i++){
            if(a[i]==ol){
                a[i]=nw;
            }
        }
        System.out.println("final all the element");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
 


