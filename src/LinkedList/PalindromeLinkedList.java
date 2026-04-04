package LinkedList;

import java.util.Scanner;

public class PalindromeLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node findMiddle(Node head){

        Node turtle = head;
        Node hare = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    static boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node middle = findMiddle(head);
        Node secondHead = reverseList(middle.next);

        Node curr = head;
        while (secondHead != null){
            if(curr.data != secondHead.data){
                return false;
            }
            secondHead = secondHead.next;
            curr = curr.next;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Node head =null, curr = null;

        for(int i=0; i<length; i++){
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
        boolean result = isPalindrome(head);
        System.out.println(result);
    }
}
