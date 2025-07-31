package com.ghanasham.sampleProject;

import com.ghanasham.sampleProject.DoublyLinkedList.DoublyLinkedList;
import com.ghanasham.sampleProject.DoublyLinkedList.impl.DoublyLinkedListImpl;

public class Main {

//    // linked list
//    public static void main(String[] args) {
//
//        LinkedList<Integer> list = new LinkedListImpl<>(10);
//        list.removeHead();
//        System.out.println(list.getLength());
//        list.printDoublyLinkedList();
//        list.append(195);
//        list.prepend(45);
//        list.append(50);
//        list.prepend(95);
//        list.append(250);
//        list.prepend(85);
//        list.append(150);
//        list.prepend(25);
//        list.append(350);
//
//        list.printDoublyLinkedList();
//        System.out.println(list.getLength());
//
//        // lets delete head
//        list.removeHead();
//        list.printDoublyLinkedList();
//        System.out.println(list.getLength());
//
//        //lets remove tail
//        list.removeTail();
//        list.printDoublyLinkedList();
//        System.out.println(list.getTail());
//        System.out.println(list.getLength());
//
//        System.out.println(list.get(5));
//        list.set(0,199);
//        list.printDoublyLinkedList();
//
//        list.insert(7,88);
//        list.insert(0,88);
//        System.out.println(list.getLength());
//
//        System.out.println("====================================");
//
//        list.printDoublyLinkedList();
//        list.remove(0);
//        list.printDoublyLinkedList();
//        list.remove(5);
//        list.printDoublyLinkedList();
//        list.remove(list.getLength()-1);
//        list.printDoublyLinkedList();
//
//        list.reverse();
//        list.printDoublyLinkedList();
//    }

    //    Doubly linked list
    public static void main(String[] args) {

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl(100);
        System.out.println(doublyLinkedList);
        doublyLinkedList.printDoublyLinkedList();

        doublyLinkedList.prepend(111);
        doublyLinkedList.append(111);
        doublyLinkedList.append(41);
        doublyLinkedList.append(617);
        doublyLinkedList.append(131);
        doublyLinkedList.prepend(91);
        doublyLinkedList.prepend(431);
        doublyLinkedList.prepend(78);
        doublyLinkedList.prepend(310);
        doublyLinkedList.printDoublyLinkedList();

        doublyLinkedList.removeHead();
        doublyLinkedList.removeTail();
        doublyLinkedList.printDoublyLinkedList();
    }
}