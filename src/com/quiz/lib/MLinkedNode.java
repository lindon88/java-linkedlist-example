package com.quiz.lib;

/**
 * Created by lindoncamaj on 2/8/18.
 */
public class MLinkedNode {

    private MLinkedNode next;
    private int value;

    public MLinkedNode(int value) {
        this(value, null);
    }

    public MLinkedNode(int value, MLinkedNode next) {
        this.next = next;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MLinkedNode getNext() {
        return this.next;
    }

    public void setNext(MLinkedNode nextNode) {
        this.next = nextNode;
    }


}
