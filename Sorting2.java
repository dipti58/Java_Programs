package ArrayProgram;

// sort the array in desending order

public class Sorting2 {
    public static void main(String[] args) {
        int[] a={10,30,2,4,6,8,3,7,12,23,15};
         for(int i=1; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
         }
    }
}
