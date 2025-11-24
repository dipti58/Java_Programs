// print sum of all even number 
package ArrayProgram;

public class Test {
    public static void main(String[] args) {
        int[] a={1,4,3,6,5,8,9,2};
        int sum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
            sum=sum+a[i];
            }
        }
        System.out.println("sum of the all even number is: " + sum);
    }
}
