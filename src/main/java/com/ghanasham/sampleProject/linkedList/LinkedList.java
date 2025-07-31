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

    // insert after item at index
    public abstract void insert(int index, T item);

    // print complete linked list
    public abstract void printLinkedList();

    // remove perticular value
    public abstract NodeInLinkedList<T> remove(int index);

    //remove tail
    public abstract NodeInLinkedList<T> removeHead();

    //remove head
    public abstract NodeInLinkedList<T> removeTail();

    // get value at index
    public abstract NodeInLinkedList<T> get(int index);

    // set value at perticular index
    public abstract void set(int index, T item);

    // reverse list
    public abstract void reverse();

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
