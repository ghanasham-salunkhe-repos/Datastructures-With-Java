package com.ghanasham.sampleProject.linkedList;


public class NodeInLinkedList<T> {
    private T item;
    private  NodeInLinkedList<T> next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public NodeInLinkedList<T> getNext() {
        return next;
    }

    public void setNext(NodeInLinkedList<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeInLinkedList{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
