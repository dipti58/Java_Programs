package ArrayProgram;
import java.util.*;
public class Searching {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a array size");
      int size=sc.nextInt();
      int[] x=new int[size];
      System.out.println("insert array element");
      for(int i=0; i<size; i++)
      {
         x[i]=sc.nextInt();
      }
      System.out.println("Enter the element to search :");
      int key=sc.nextInt();
      boolean found=false;
      for(int i=0; i<x.length; i++)
        {
         if(key==x[i]){
         
       System.out.println("the index is :"+i);
       System.out.println("the element is :"+x[i]);
       found=true;
           }
      //   else{
      //System.out.println("Element not found");
       }
       if(!found){
        System.out.println("element not found");
       }
      }
    }


