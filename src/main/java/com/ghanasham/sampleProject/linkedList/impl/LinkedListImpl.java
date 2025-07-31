package com.ghanasham.sampleProject.linkedList.impl;

import com.ghanasham.sampleProject.linkedList.LinkedList;
import com.ghanasham.sampleProject.linkedList.NodeInLinkedList;

public class LinkedListImpl<T> extends LinkedList<T> {

    // constructor for linked list
    public LinkedListImpl(T item) {
        head = new NodeInLinkedList<>();
        head.setItem(item);
        head.setNext(null);
        tail = head;
        length=1;
    }

    // adding element to head : O(1)
    @Override
    public void prepend(T item) {
        NodeInLinkedList<T> newNode = new NodeInLinkedList<>();
        if( length==0){
            newNode.setItem(item);
            newNode.setNext(null);
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setItem(item);
            newNode.setNext(head);
            head=newNode;
        }
        length++;
    }

    // append element at last : O(1)
    @Override
    public void append(T item) {
        NodeInLinkedList<T> newNode = new NodeInLinkedList<>();
        newNode.setItem(item);
        newNode.setNext(null);
        if( length==0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail=newNode;
        }
        length++;
    }

    // print complete linked list : O(n)
    @Override
    public void printLinkedList() {
        if (length == 0) {
            System.out.println("head --> null");
            return;
        }
        NodeInLinkedList<T> newNode = head;
        System.out.print("head --> ");
        while (newNode.getNext() != null) {
            System.out.print(newNode.getItem()+" --> ");
            newNode=newNode.getNext();
        }
        System.out.print(newNode.getItem()+" --> null\n");
    }

    @Override
    public void insertAfter(T item) {

    }

    @Override
    public void insertBefore(T item) {

    }

    @Override
    public NodeInLinkedList<T> remove(T item) {
        return null;
    }

    // remove head : O(1)
    @Override
    public NodeInLinkedList<T> removeHead() {
        if(length==1){
            head=null;
            tail=null;
            length--;
            return null;
        }
        NodeInLinkedList<T> newNode = head;
        head=head.getNext();
        newNode.setNext(null);
        length--;
        return newNode;
    }

    // remove tail : O(n)
    @Override
    public NodeInLinkedList<T> removeTail() {
        NodeInLinkedList<T> newNode = head;
        NodeInLinkedList<T> oldTail= tail;
        while(newNode.getNext()!= oldTail) {
            newNode=newNode.getNext();
        }
        tail=newNode;
        tail.setNext(null);
        length--;
        return oldTail;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
