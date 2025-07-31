package com.ghanasham.sampleProject.DoublyLinkedList.impl;

import com.ghanasham.sampleProject.DoublyLinkedList.DoublyLinkedList;
import com.ghanasham.sampleProject.DoublyLinkedList.NodeInDoublyLinkedList;


public class DoublyLinkedListImpl<T> extends DoublyLinkedList<T> {

    public DoublyLinkedListImpl(T value) {
        NodeInDoublyLinkedList node = new NodeInDoublyLinkedList();
        node.setData(value);
        node.setNext(null);
        node.setPrev(null);
        this.head = node;
        this.tail = node;
        length++;
    }

    // insert at head : O(1)
    @Override
    public void prepend(T item) {
        NodeInDoublyLinkedList<T> newNode = new NodeInDoublyLinkedList<>();
        if (length == 0) {
            newNode.setData(item);
            newNode.setNext(null);
            newNode.setPrev(null);
            head = newNode;
            tail = newNode;
        } else {
            newNode.setData(item);
            newNode.setNext(head);
            head.setPrev(newNode);
            newNode.setPrev(null);
            head = newNode;
        }
        length++;
    }

    // insert at tail : O(1)
    @Override
    public void append(T item) {
        NodeInDoublyLinkedList<T> newNode = new NodeInDoublyLinkedList<>();
        newNode.setData(item);
        newNode.setNext(null);
        if (length == 0) {
            newNode.setPrev(null);
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        length++;
    }

    @Override
    public void insert(int index, T item) {

    }

    // printing linkedList : O(n)
    @Override
    public void printDoublyLinkedList() {
        if (length == 0) {
            System.out.println("head --> null");
            return;
        }
        NodeInDoublyLinkedList<T> newNode = head;
        System.out.print("head --> ");
        while (newNode.getNext() != null) {
            System.out.print(newNode.getData() + " <--> ");
            newNode = newNode.getNext();
        }
        System.out.print(newNode.getData() + " --> null\n");
    }


    // printing linkedList : O(n)
    @Override
    public void printReversedDoublyLinkedList() {
        if (length == 0) {
            System.out.println("tail --> null");
            return;
        }
        NodeInDoublyLinkedList<T> newNode = tail;
        System.out.print("tail --> ");
        while (newNode.getPrev() != null) {
            System.out.print(newNode.getData() + " <--> ");
            newNode = newNode.getPrev();
        }
        System.out.print(newNode.getData() + " --> null\n");
    }

    @Override
    public NodeInDoublyLinkedList<T> remove(int index) {
        return null;
    }

    @Override
    public NodeInDoublyLinkedList<T> removeHead() {
        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return null;
        }
        NodeInDoublyLinkedList<T> newNode = head.getNext();
        NodeInDoublyLinkedList<T> old= head;
        newNode.setPrev(null);
        head.setNext(null);
        head=newNode;
        length--;
        return old;
    }

    @Override
    public NodeInDoublyLinkedList<T> removeTail() {
        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return null;
        }
        NodeInDoublyLinkedList<T> newNode = tail.getPrev();
        NodeInDoublyLinkedList<T> old= tail;
        newNode.setNext(null);
        tail.setPrev(null);
        tail=newNode;
        length--;
        return old;
    }

    @Override
    public NodeInDoublyLinkedList<T> get(int index) {
        return null;
    }

    @Override
    public void set(int index, T item) {

    }


    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
