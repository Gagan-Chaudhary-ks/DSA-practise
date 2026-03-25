package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedLists {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node mergeRecursive(Node head1, Node head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        if(head1.data <= head2.data){
            head1.next = mergeRecursive(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeRecursive(head1, head2.next);
            return head2;
        }
    }
    static Node mergeIterative(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                curr.next = head1;
                head1 = head1.next;
            }else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if(head2 == null){
            curr.next = head1;
        }
        if(head1 == null){
            curr.next = head2;
        }
        return dummy.next;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        Node head1 = null, curr1 = null;

        for (int i=0; i<n1; i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if(head1 == null){
                head1 = curr1 = newNode;
            }else{
                curr1.next = newNode;
                curr1 = newNode;
            }
        }

        int n2 = sc.nextInt();
        Node head2 = null, curr2 = null;

        for(int i=0; i<n2; i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if(head2 == null){
                head2 = curr2 = newNode;
            }else{
                curr2.next = newNode;
                curr2 = newNode;
            }
        }

        Node result = mergeIterative(head1, head2);

        Node curr = result;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
