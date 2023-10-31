package LinkedLists;

public class SinglyLinkedListNode {
    int data;
   SinglyLinkedListNode next;

    SinglyLinkedListNode() {
    }

    SinglyLinkedListNode(int data) {
        this.data = data;
    }

    SinglyLinkedListNode(int data,SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}
