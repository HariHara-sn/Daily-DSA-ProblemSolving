package Day9;
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        
        
        while(list1 !=null || list2 !=null){

            if(list1 ==null){
                head = insert(head,list2.val);
                list2 = list2.next;
            }
            else if(list2 == null){
                head = insert(head,list1.val);
                list1 = list1.next;
            }
            else{
                if(list1.val <= list2.val){
                    head = insert(head,list1.val);
                    list1 = list1.next;
                }
                else{
                    head = insert(head,list2.val);
                    list2 = list2.next;
                }
            }
        }

        return head;
    }

    static ListNode insert(ListNode head,int val){
        ListNode newnode = new ListNode(val);
        if(head == null){
            return newnode;
        }

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;
        return head;
    }
}
