package LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverseList(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;

        return prev;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the linked list : ");
        int n = sc.nextInt();

        Node head = null, curr = null;

        for(int i=0; i<n; i++){
            System.out.print("Enter the " + i + "th" + " value : ");
            int input = sc.nextInt();
            Node newNode = new Node(input);

            if(head == null){
                head = newNode;
                curr = newNode;
            }
            else{
                curr.next = newNode;
                curr = newNode;
            }
        }

        Node reversedNode = reverseList(head);

        Node currRev = reversedNode;
        while(currRev != null){
            System.out.print(currRev.data + "->");
            currRev = currRev.next;
        }
        System.out.println("null");
    }
}
