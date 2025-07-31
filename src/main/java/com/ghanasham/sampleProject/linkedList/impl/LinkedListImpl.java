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

//    complexity of o(n)
    @Override
    public void insert(int index, T item) {
        
        if (index==0){
            prepend(item);
        } else if (index==length) {
            append(item);
        }
        else {
            NodeInLinkedList<T> prev= get(index-1);
            NodeInLinkedList<T> next = get(index);
            NodeInLinkedList<T> newNode = new NodeInLinkedList<>();
            newNode.setItem(item);
            prev.setNext(newNode);
            newNode.setNext(next);
        }
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


    // remove function with time complexity : O(n)
    @Override
    public NodeInLinkedList<T> remove(int index) {
        if (index==0) {
            return removeHead();
        }
        else if (index==length-1) {
            return removeTail();
        }
        else {
            NodeInLinkedList<T> prev= get(index-1);
            NodeInLinkedList<T> next = get(index+1);
            NodeInLinkedList<T> nodeToBDeleted= get(index);
            nodeToBDeleted.setNext(null);
            prev.setNext(next);
            length--;
            return nodeToBDeleted;
        }

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

    // get value at perticular index : O(n)
    @Override
    public NodeInLinkedList<T> get(int index) {

        if(index>length){
            throw new IndexOutOfBoundsException();
        }
        else if(length==0){
            return null;
        } else if (index==0) {
            return head;
        }
        else if (index==length-1) {
            return tail;
        }
        else {
            int count=0;
            NodeInLinkedList<T> newNode = head;
            while (count<index) {
                newNode=newNode.getNext();
                count++;
            }
            return newNode;
        }

    }

    // set value : O(n)
    @Override
    public void set(int index, T item) {

        if( index>length ){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            head.setItem(item);
        }
        else if (index==length-1) {
            tail.setItem(item);
        }
        else {
            get(index).setItem(item);
        }
    }

    // reverse list  O(n)
    @Override
    public void reverse() {
        NodeInLinkedList temp = head;
        head = tail;
        tail = temp;
        NodeInLinkedList after = temp.getNext();
        NodeInLinkedList before = null;
        for (int i = 0; i < length; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
