package LinkedList;

import java.util.Scanner;

public class DeleteNthNodeFromLast {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteNth(int size, Node head, int n){
        if(head == null ){
            return null;
        }
        if(head.next == null){
            return (n==1) ? null : head;
        }

        if(n == size){
            return head.next;
        }

        Node curr = head;

        int i=1;
        Node prev = head;
        while(i < (size - n )){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        Node head = null, curr = null;
        for(int i=0; i<length; i++){
            int input = sc.nextInt();
            Node newNode = new Node(input);

            if(head == null){
                head = newNode;
                curr = newNode;
            }
            else{
                curr.next = newNode;
                curr = curr.next;
            }
        }
        int n = sc.nextInt();

        Node resNode = deleteNth(length, head, n);

        Node currPrint = resNode;
        while(currPrint != null){
            System.out.print(currPrint.data + "->");
            currPrint = currPrint.next;
        }
        System.out.print("null");
    }
}
