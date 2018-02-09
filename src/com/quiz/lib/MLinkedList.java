package com.quiz.lib;

/**
 * Created by lindoncamaj on 2/8/18.
 */
public class MLinkedList{

    private MLinkedNode head;
    private int size;

    public MLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Add new item
     * @param value
     */
    public void add(int value) {

        MLinkedNode temp = new MLinkedNode(value);
        MLinkedNode curr = head;

        if (head == null) {
            head = temp;
        } else {
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }

            curr.setNext(temp);
        }

        this.size++;
    }

    /**
     * Add item at index
     * @param value
     * @param index
     */
    public void add(int value, int index) {

        MLinkedNode temp = new MLinkedNode(value);
        MLinkedNode curr = head;

        if (index == 0){
            temp.setNext(head);
            this.head = temp;
        } else{
            for(int i = 1; i < index; i++){
                curr = curr.getNext();
            }
            temp.setNext(curr.getNext());
            curr.setNext(temp);
        }

        this.size++;
    }

    /**
     * Get item at index
     * @param index
     * @return
     */
    public int get(int index) {

        MLinkedNode curr = head;
        for (int i = 0; i < index; i++){
            curr = curr.getNext();
        }

        return curr.getValue();
    }

    /**
     * Remove item at index
     * @param index
     */
    public void remove(int index){

        // if head is null throw exception
        if(head == null) throw new RuntimeException("cannot remove");

        // remove head
        if(index == 0){
            head = head.getNext();
            return;
        }

        MLinkedNode cur = head;
        MLinkedNode prev = null;

        int iterator = 0;
        while(cur != null && iterator != index){
            prev = cur;
            cur = cur.getNext();
            iterator++;
        }

        if(cur == null) throw new RuntimeException("cannot remove");

        // remove current node
        prev.setNext(cur.getNext());
        this.size--;
    }

    /**
     * Remove last item on list
     */
    public void removeLast(){
        MLinkedNode curr = head;
        int iterator = 0;
        while ((curr = curr.getNext()) != null){
            iterator++;
        }

        remove(iterator);
    }

    /**
     * Remove all elements that have a greater value
     * @param value
     */
    public void removeGreaterThan(int value){
        if(head == null) throw new NullPointerException("List head is null");

        for(int i = this.size()-1; i >= 0; i--){
            if(this.get(i) > value){
                this.remove(i);
            }
        }
    }

    /**
     * Get list size
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * List to string
     * @return
     */
    public String toString() {
        String list = "";
        list += "[" + this.head.getValue() + "]";

        MLinkedNode curr = head.getNext();
        while (curr != null){
            list += "[" + curr.getValue() + "]";
            curr = curr.getNext();
        }

        return list;

    }

}
