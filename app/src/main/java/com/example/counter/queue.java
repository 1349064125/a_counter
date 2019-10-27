package com.example.counter;

import java.util.concurrent.DelayQueue;

public class queue {
    private String base[];
    private int front,rear,j;
    queue(){
        base = new String[100];
        front=0;
        rear=0;
        j=0;
    }
    public void enQueue(String s){
        base[rear]=s;
        rear++;
    }
    public String deQueue(){
        return base[front++];
    }

    public boolean emptyQueue(){
        return front==rear;
    }
    public void emptymake(){
        front=rear=0;
    }
    public int gethigh() {
        return rear - front+1;
    }
    public String scans()
    {
        return base[j];
    }
    public void addj(){
        j++;
    }
    public void setJ(){
        j=0;
    }
}
