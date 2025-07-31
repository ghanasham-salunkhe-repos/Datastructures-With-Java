package com.ghanasham.sampleProject.DoublyLinkedList;


public abstract class DoublyLinkedList<T> {

    protected NodeInDoublyLinkedList<T> head;
    protected NodeInDoublyLinkedList<T> tail;
    protected int length;

    // adding element to head
    public abstract void prepend(T item);

    // append element at last
    public abstract void append(T item);

    // insert after item at index
    public abstract void insert(int index, T item);

    // print complete linked list
    public abstract void printDoublyLinkedList();

    // print complete linkedlinkedlist in opposite order
    public abstract void printReversedDoublyLinkedList();

    // remove perticular value
    public abstract NodeInDoublyLinkedList<T> remove(int index);

    //remove tail
    public abstract NodeInDoublyLinkedList<T> removeHead();

    //remove head
    public abstract NodeInDoublyLinkedList<T> removeTail();

    // get value at index
    public abstract NodeInDoublyLinkedList<T> get(int index);

    // set value at perticular index
    public abstract void set(int index, T item);

    // member functions
    public NodeInDoublyLinkedList<T> getHead() {
        return head;
    }

    public void setHead(NodeInDoublyLinkedList<T> head) {
        this.head = head;
    }

    public NodeInDoublyLinkedList<T> getTail() {
        return tail;
    }

    public void setTail(NodeInDoublyLinkedList<T> tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
