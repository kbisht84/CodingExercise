package LinkList;

import java.util.HashMap;
import java.util.Map;

//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the second node.
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
       ListNode node =head;
        Map<ListNode,Integer> map=new HashMap<>();
        int count=-1;
        while(node.next!=null){
            if(map.get(node).equals(null))
                    map.put(node,count++);
            else
                return true;
            node=node.next;



        }
        return false;
    }


}
