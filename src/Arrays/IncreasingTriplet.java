package Arrays;

public class IncreasingTriplet {
//Input: [1,2,3,4,5]
//Output: true
    //Input: [5,4,3,2,1]
    //1,5,2,7,6
    //5,8,1,3,4
//Output: false
    public static boolean increasingTriplet(int[] nums) {
        int length = nums.length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            if(nums[i]<=low)
                low = nums[i];
                else
                    if(nums[i] <=high)
                        high = nums[i];
                    else {
                        return true;
                    }

        }
        return false;


    }
//    public boolean increasingTriplet(int[] nums) {
//        int first=Integer.MAX_VALUE;
//        int second=Integer.MAX_VALUE;
//        int third=Integer.MAX_VALUE;
//
//        for(int p=0; p<nums.length; p++){
//            if(nums[p]<=third){
//                third=nums[p];
//            }else{
//                if(nums[p]<=second){
//                    first=third;
//                    second=nums[p];
//                }else{
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static  void main(String []args){
     int [] a ={1,1,1,1};
    System.out.println(increasingTriplet(a));
    }
}
