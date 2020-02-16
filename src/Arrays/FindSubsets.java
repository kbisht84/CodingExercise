package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        if(nums ==null || nums.length == 0)
            return subsets;
        List<Integer> current = new ArrayList<>();
        calcSubsets(nums,subsets,current,0);
        return subsets;
    }

    private void calcSubsets(int []nums, List<List<Integer>> subsets, List<Integer> current, int startIndex){
        subsets.add(new ArrayList<>(current));

        for(int i=startIndex; i<nums.length; i++){
            current.add(nums[i]);
            calcSubsets(nums, subsets, current, i+1);
            current.remove(current.size()- 1);
        }
    }
}
