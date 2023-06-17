import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args){
         ListNode first = new ListNode(1);
         ListNode second = new ListNode(2,first);
         ListNode third = new ListNode(2,second);
         ListNode fourth = new ListNode(1,third);
        PalindromeLinkedList pl = new PalindromeLinkedList();
        System.out.println(pl.isPalindrome(fourth));
    }

    public boolean isPalindrome(ListNode head) {
        boolean result = true;
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        //iterate through all linkedList and save them to stack for LIFO
        while (temp!=null){
            s.push(temp.val);
            temp = temp.next;
        }

        //compare the first and last and so on..
        temp = head;
        while (temp!=null){
            if(temp.val!=s.pop()){
                return false;
            }
            temp = temp.next;
        }
        return result;
    }

    /**
     * Definition for singly-linked list.*/
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
