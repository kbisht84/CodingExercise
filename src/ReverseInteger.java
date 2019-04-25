public class ReverseInteger {
//Input: -123
//Output: -321

 //Input: -123
 //Output: -321

//Input: 120
//Output: 21
    public static int reverse(int x) {
           String s = Integer.toString(x);
           char[] ch= s.toCharArray();
           int length = ch.length;
           int sum=0;
           for(int i=length-1;i>=0;i--){
               sum= sum +(ch[i]-'0') *10^i;
           }
           return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
