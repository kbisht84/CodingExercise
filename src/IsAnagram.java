public class IsAnagram {
    //Input: s = "anagram", t = "nagaram"
    //Output: true

    //Input: s = "rat", t = "car"
    //Output: false

    public static boolean isAnagram(String s, String t) {
            if(s.length()!=t.length())
                return  false;
            char[] ch1 =s.toCharArray();
            char[] ch2 = t.toCharArray();
            int [] count=new int[256];
            int [] count1=new int[256];

            for(char c:ch1)
                count[c]++;
            for(char c:ch2)
                count1[c]++;
            for(int i=0;i<256;i++){
                if(count[i]!=count1[i])
                    return false;

            }
            return true;

    }

    public static  void main(String[] args) {
        System.out.println(isAnagram("%anagram^*%^","^^n%*agaram%"));
    }

}
