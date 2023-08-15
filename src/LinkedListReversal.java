// Aufgabe: Linked List Umkehrung

// Schreibe eine Java-Funktion, die eine verkettete 
// Liste umkehrt. Implementiere dazu eine Methode, 
// die das erste Element der Liste als Parameter 
// erhält und die umgekehrte Liste zurückgibt.

// Gegeben ist die Definition der verketteten Liste:



public class LinkedListReversal {

    public ListNode reverseList(ListNode head) {

      ListNode prev = null;
      ListNode current = head;

      while (current != null) {             // current = 5 / 4 / 3
        ListNode nextTemp = current.next;  // nextTemp = current.next = 4 / 3 / 2
        current.next = prev;              // current.next = null / 5 / 4
        prev = current;                   // prev = 5 /4 / 3
        current = nextTemp;               // current = 4 / 3 / 2
      }

      return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        LinkedListReversal reversal = new LinkedListReversal();
        ListNode reversedHead = reversal.reverseList(head);

        // Gib die umgekehrte Liste aus
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}



