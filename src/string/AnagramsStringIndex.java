package string;

import java.util.ArrayList;
import java.util.List;

public class AnagramsStringIndex {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result =new ArrayList<>();

        if(s == null || s.length() == 0)
            return result;
        int[] count_char = new int[26];
        for(char c:p.toCharArray()){
            count_char[c-'a']++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while(right < s.length()){

// matches anagram
            if(count_char[s.charAt(right++) - 'a']--  >= 1) {
                count--;
            }
//             add to the list
            if(count == 0)
                result.add(left);
//                 Keep extending window from left side
            if(right - left == p.length() && count_char[s.charAt(left++) - 'a']++ >=0){
                count++;
            }
        }
        return result;
    }
}
