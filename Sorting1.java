public class Sorting1 {
    public static void main(String[] args){
        int a[]={2,5,3,8,9,6,1,10,4,7};

        for(int i=1; i<a.length; i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
