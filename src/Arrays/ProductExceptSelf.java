package Arrays;

public class ProductExceptSelf {


    public int[] productExceptSelf(int[] nums) {
        int N =nums.length;
        int[] output_array = new int[N];
        output_array[0]= 1;

        for(int i=1; i<N; i++){
            output_array[i] = nums[i-1]* output_array[i-1];
        }

        int R =1;
        for(int i=N-1; i>=0; i--){
            output_array[i] = output_array[i]* R;
            R = R*nums[i];
        }

        return output_array;
    }
}
