package com.example.counter;

public class numStack {
    private float base[];
    private int i,j,k;
    numStack(){
        i=0;
        j=0;
        k=0;
        base =new float [100];
    }
    public float getTop()
    {
        return base[i-1];
    }
    public void push(float num)
    {
        base[i]=num;
        i++;
    }
    public float pop()
    {
        i--;
        return base[i];
    }
    public  boolean EmptyStack()
    {
        if (i==0)
            return true;
        else
            return false;
    }
    public void emptyMake(){
        i=0;
        k=0;
        j=0;
    }
    public int getI()
    {
        return i;
    }
    public float getstack(){
        return base[j++];
    }
    public void setJ(){
        j=0;
    }
    public float destack()
    {
        return base[k++];
    }

}
