package collection_framework.ListInterface.LinkedList;

import java.util.LinkedList;

public class CreatingLinkedList {

    static void main() {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        for (Integer x : ll) {
            System.out.print(x + " ");
        }
    }
}
