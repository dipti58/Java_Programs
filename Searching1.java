package ArrayProgram;

public class Searching1 {
   static int binarysearch(int a[],int key){
      int l=0,h=a.length-1,mid;
       
      while(l<=h){
         mid=(l+h)/2;
         if(a[mid]==key)
         return mid;
         else if(a[mid]<key)
         l=mid+1;
         else
         h=mid-1;
      }
      return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};

        int result= binarysearch(arr,7);
        System.out.println(result);

    }
}



