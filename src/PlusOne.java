import java.util.Arrays;

public class PlusOne {
//[0,1,0,3,12]
    public static void moveZeroes(int[] a) {
        int j=0;
         for(int i=0;i<a.length;i++){

                while(a[i]==0) {
                continue;
        }
                int temp =a[i];
                a[i] =a[j];
                a[j]=temp;
                j=i;
        }

         System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        int a[] ={0,1,0,3,12};
        moveZeroes(a);
    }

}
