package com.ghanasham.sampleProject.DoublyLinkedList;

public class NodeInDoublyLinkedList<T> {

    private T data;
    private NodeInDoublyLinkedList<T> next;
    private NodeInDoublyLinkedList<T> prev;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeInDoublyLinkedList<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeInDoublyLinkedList<T> prev) {
        this.prev = prev;
    }

    public NodeInDoublyLinkedList<T> getNext() {
        return next;
    }

    public void setNext(NodeInDoublyLinkedList<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeInDoublyLinkedList{" +
                "data=" + data +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
