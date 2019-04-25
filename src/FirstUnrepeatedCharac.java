public class FirstUnrepeatedCharac {
//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.
    public static int firstUniqueChar(String s){
        char[] ch=s.toCharArray();
        if(ch.length==0)
            return -1;
        int [] count=new int[128];

        for(char c:ch){
            count[c]++;
        }
         for(int i=0;i<ch.length;i++){
             if(count[ch[i]]==1)
                 return i;
         }
         return 0;
    }

    public static void main(String []args){

        System.out.println(firstUniqueChar(""));
    }


}
