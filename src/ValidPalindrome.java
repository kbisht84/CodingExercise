public class ValidPalindrome {
//Input: "A man, a plan, a canal: Panama"
//Output: true
 //Input: "race a car"
    //Output: false

    public static boolean isPalindrome(String s) {
      if(s.length()==0)
          return true;
      String s1=s.toLowerCase();
      int j=s1.length()-1;
      int i=0;

      while(i<=j){
          if(!(s1.charAt(i)>='a'&&s1.charAt(i)<='z')||s1.charAt(i)>='0'&&s1.charAt(i)<='9')
              i++;
          else if (!(s1.charAt(j)>='a'&&s1.charAt(j)<='z')||s1.charAt(j)>='0'&&s1.charAt(j)<='9')
              j--;
          else if(s1.charAt(i)==s1.charAt(j)){
                    i++;
                    j--;
          }
          else
              return false;
      }
      return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));

    }
}
