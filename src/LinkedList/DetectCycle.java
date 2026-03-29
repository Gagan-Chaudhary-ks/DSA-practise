package LinkedList;

public class DetectCycle {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static boolean isCyclic(Node head){
        if(head == null){
            return false;
        }

        Node turtle = head;
        Node hare = head;

        while(hare != null && hare.next != null){


            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}
