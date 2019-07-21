package Arrays;
//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Input: "pwwkebw"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
            int length = s.length();
            int currMax = 1;
            int max = 0;
            int i,j;
            for (i=0; i<length -1;i++) {
                for ( j = i + 1; j < length; j++) {
                    if (s.charAt(i) != s.charAt(j)) {
                        currMax++;

                    } else {
                        if (currMax > max)
                            max = currMax;
                        currMax = 1;
                        break;
                    }
                }
                i=j;

            }

            return max;

    }


    public static void main(String args[]){
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
