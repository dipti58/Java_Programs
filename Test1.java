package ArrayProgram;

class Test1{
    public static void main(String[] args) {
        int[] a={2,4,-6,8,-5,-8,9,3,10};
        int sum=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                sum=sum+a[i];
            }
        }
        System.out.println("sum of all +ve element :"+ sum);
    }
}