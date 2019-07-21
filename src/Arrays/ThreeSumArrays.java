package Arrays;
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//][[-2,0,2],[-2,1,1]]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumArrays {


    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer>  list1;
        List<List<Integer>>  list2 =new ArrayList<>();

        //First sort the array
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int length =nums.length;

        for(int i=0;i<length-2;i++){
            int l=i+1;
            int r=length-1;

            while(l<r) {
                if (nums[l] + nums[i] + nums[r] == 0) {
                    list1 =new ArrayList<>();
                    list1.add(nums[l]);
                    list1.add(nums[i]);
                    list1.add(nums[r]);
                        if(!list2.contains(list1))
                            list2.add(list1);

                }
                else if (nums[l] + nums[i] + nums[r] > 0)
                        r--;
                    else
                        l++;

            }

            }
            return list2;
     }

     public static void main(String args[]){
        int[] a ={-2,0,1,1,2};
         System.out.println(threeSum(a));

     }
}
