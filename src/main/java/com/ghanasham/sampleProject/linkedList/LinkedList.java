package com.ghanasham.sampleProject.linkedList;

public abstract class LinkedList<T> {

    // data members
    protected NodeInLinkedList<T> head;
    protected NodeInLinkedList<T> tail;
    protected int length;

    // adding element to head
    public abstract void prepend(T item);

    // append element at last
    public abstract void append(T item);

    // insert after some value
    public abstract void insertAfter(T item);

    // insert before some value
    public abstract void insertBefore(T item);

    // print complete linked list
    public abstract void printLinkedList();

    // remove perticular value
    public abstract NodeInLinkedList<T> remove(T item);

    //remove tail
    public abstract NodeInLinkedList<T> removeHead();

    //remove head
    public abstract NodeInLinkedList<T> removeTail();


    // member functions
    public NodeInLinkedList<T> getHead() {
        return head;
    }

    public NodeInLinkedList<T> getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
}
