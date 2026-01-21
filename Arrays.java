package ArrayProgram;

public class Arrays {
//1)Inserting an element into an array at least position
    
    static int[] insertAtLast(int[] a, int element) {
        int[] b = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        b[a.length] = element; // insert at last index
        return b;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(insertAtLast(a, 60)));
    }
}

    

