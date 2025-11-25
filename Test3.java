package ArrayProgram;
//8)sum of prime element present in an arrays

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size :");
      int a=sc.nextInt();
      int[] x=new int[a];
      System.out.println("Enter element:");
      for(int i=0; i<a; i++){
         x[i]=sc.nextInt();
      }
      int sum=0;
      for(int i=0 ; i<a; i++){
        int count = 0;
        for(int j=1;j<=x[i];j++)
        {
        if(x[i]%j==0)
        {
        count++;
        }
    }
        if(count==2)
        {
        sum=sum+x[i];
        }
    }
    System.out.println("Sum of prime elements: "+sum);
  }
}
