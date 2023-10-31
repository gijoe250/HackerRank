package LinkedLists;

public class MergeTwoSortedLists {
    public static void main(String[] args){
        SinglyLinkedListNode head3 =  new SinglyLinkedListNode(3);
        SinglyLinkedListNode head2 =  new SinglyLinkedListNode(2,head3);
        SinglyLinkedListNode list1 =  new SinglyLinkedListNode(1,head2);

        SinglyLinkedListNode head4 =  new SinglyLinkedListNode(4);
        SinglyLinkedListNode list2 =  new SinglyLinkedListNode(3,head4);

        SinglyLinkedListNode answer = mergeLists(list1, list2);
        SinglyLinkedListNode temp = answer;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode answer, temp;

        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if (head1.data <= head2.data){
            answer = head1;
            head1 = head1.next;
        }else{
            answer = head2;
            head2 = head2.next;
        }

        temp = answer;
        while(head1 != null && head2 != null){
            if (head1.data <= head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        if (head1 == null){
            temp.next = head2;
        } else {
            temp.next = head1;
        }
        return answer;
    }
}
