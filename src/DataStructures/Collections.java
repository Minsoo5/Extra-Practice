package DataStructures;

import java.util.LinkedList;

public class Collections {


    // You can use linkedList to mimic a stack OR a queue

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        linkedList.remove("B");

        linkedList.add(1, "B");
        System.out.println(linkedList);

    }
}
