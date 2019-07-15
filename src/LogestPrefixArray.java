import java.util.*;

public class LogestPrefixArray {
//Input: ["flower","flow","flight"]
//Output: "fl"
    public static String longestPrefix(String []s){
        StringBuffer sb =new StringBuffer();
         Arrays.sort(s);
        int length=s[0].length();

        for(int i=0;i<length;i++){
        if(s[0].charAt(i)!=s[length-1].charAt(i))
             break;
          sb.append(s[0].charAt(i));

            }
        return sb.toString();
    }

    public static void main(String[] args) {
        String [] str ={"flower","flow","flight"};
        longestPrefix(str);
    }


}
