package ArrayProgram;

//13)update last occurance

class Test8{
       public static void main(String[] args) {
        int x[]={2,6,4,3,2,8,9,3,2,5};
        int ol=2,nw=7;
        for(int i=x.length-1; i>=0; i--){
            if(ol==x[i]){
                x[i]=nw;
                break;
            }
        }
        for(int i=0 ;i<x.length; i++){
            System.out.println(x[i]);
        }
    }
  }
    