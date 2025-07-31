package com.ghanasham.sampleProject;

import com.ghanasham.sampleProject.linkedList.LinkedList;
import com.ghanasham.sampleProject.linkedList.impl.LinkedListImpl;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedListImpl<>(10);
        list.removeHead();
        System.out.println(list.getLength());
        list.printLinkedList();
        list.append(195);
        list.prepend(45);
        list.append(50);
        list.prepend(95);
        list.append(250);
        list.prepend(85);
        list.append(150);
        list.prepend(25);
        list.append(350);

        list.printLinkedList();
        System.out.println(list.getLength());

        // lets delete head
        list.removeHead();
        list.printLinkedList();
        System.out.println(list.getLength());

        //lets remove tail
        list.removeTail();
        list.printLinkedList();
        System.out.println(list.getTail());
        System.out.println(list.getLength());

    }
}