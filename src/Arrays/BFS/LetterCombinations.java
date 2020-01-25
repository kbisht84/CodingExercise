package Arrays.BFS;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList();

        if(digits.length() == 0)
            return output;
        output.add("");
        String [] mapping= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        for(int i=0; i< digits.length();i++){
            int index = digits.charAt(i) - '0';
            while(output.peek().length() == i){
                String permutation = output.remove();
                for(char c : mapping[index].toCharArray())
                    output.add(permutation + c);

            }

        }

        return output;
    }
}
