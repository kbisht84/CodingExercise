import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//[-1, 0, 1, 2, -1, -4]
//-4,-1,-1,0,1,2
public class ThreesSumArrays {

    public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> list1= new ArrayList<>();
            ArrayList<Integer> list =null;
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++){
                    int low = i+1;
                    int high = nums.length -1;
                    while(low < high) {
                        if (nums[i] + nums[low] + nums[high] == 0) {
                            list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[low]);
                            list.add(nums[high]);
                            if(!list1.contains(list))
                                 list1.add(list);
                            //System.out.println(list1);
                            low++;
                            high--;
                        }
                        else if (nums[i] + nums[low] + nums[high] < 0)
                            low++;
                        else
                            high--;
                    }
                }
                    return list1;
            }
    public static void main(String args[]){
        int a[]={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));
    }

    }

