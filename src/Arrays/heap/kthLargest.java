package Arrays.heap;

import java.util.PriorityQueue;

public class kthLargest {

    public int findKthLargest(int[] nums, int k) {

        if(nums == null || nums.length == 0)
            return -1;
        PriorityQueue<Integer> minheap = new PriorityQueue();

        for(int i :nums){
            minheap.add(i);
            if(minheap.size() > k)
                minheap.remove();
        }
        return minheap.remove();
    }

}
