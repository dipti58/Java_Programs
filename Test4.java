package ArrayProgram;
// 9)calculate factorial of an element present in an array
  
public class Test4 {
    
    public static void main(String[] args) {
int[] a={3,4,6,7,8,9,10,12,15};

for(int i=0; i<a.length; i++){
    int fact=1;
    for(int j=1; j<=a[i]; j++){
        fact=fact*j;
    }
    System.out.println("factroial of each element :"+fact);
  }
 }

}
