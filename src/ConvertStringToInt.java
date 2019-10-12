//

public class ConvertStringToInt {

    public static int convert(String s){
        char[] ch=s.toCharArray();
        int length =ch.length;
        int n =length-1;
        int totalSum =0;
        for(int i=0;i<=length-1;i++){
            if(ch[i]==' '||ch[i]=='-')
                return 0;
            if(ch[i]<='9'&&ch[i]>='0'){
             //   int sum = (int)ch[i]*Math.pow(10,n) + totalSum;
           //     totalSum = sum;
            }
        }
        return totalSum;

    }

    public static void main(String[] args) {

    }

}
