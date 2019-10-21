package Arrays;

import java.util.HashSet;

//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Input: "pwwkebw"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
            int i=0;
            int j=0;
            int max = 0;
            HashSet<Character> set =new HashSet<>();
            while(j < s.length()) {
                if(!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    max = Math.max(set.size(),max);
                    j++;
                }
                else{
                    set.remove(s.charAt(i));
                    i++;
                    }
            }

            return max;

    }


    public static void main(String args[]){
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
