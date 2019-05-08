package Arrays;

import java.util.*;

//Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//Output:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> groupAnagrams =new ArrayList<>();
         Map<String,List<String>> map=new HashMap<>();
         for(String str:strs){
             char []ch=str.toCharArray();
             Arrays.sort(ch);
             String sorted = new String(ch);
             if(!map.containsKey(sorted))
                 map.put(sorted,new ArrayList<>());
             map.get(sorted).add(str);


         }
        groupAnagrams.addAll(map.values());
         return groupAnagrams;
    }
}
