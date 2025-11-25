package ArrayProgram;

//7)calaculate sum of elements which are divisible by 2 and 3 presents in an arrays

public class Test2 {
  public static void main(String[] args) {
     int[] a={2,4,6,5,7,3,8,20,10,48,55};
     int sum=0;
     for(int i=1; i<a.length; i++){
        if(a[i]%2==0 && a[i]%3==0){
        sum=sum+a[i];
        }
     }
     System.out.println("sum of all divisible element :"+sum);
  }  
}
