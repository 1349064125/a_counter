package com.example.counter;

public class operaStack {
    public String base[];
    private int i,j;
    operaStack(){
        i=0;
        base = new String[100];
    }
    public String getTop()
    {
        return base[i-1];
    }
    public void push(String oper){
        base[i]=oper;
        i++;
    }
    public String pop(){
        i--;
        return base[i];
    }
    public boolean emptyStack(){
        if(i==0)
            return true;
        else
            return false;
    }
    public void emptyMake(){
        i=0;
        j=0;
    }
    public int getI()
    {
        return i;
    }
    public String getstack(){
        return base[j++];
    }
    public void setJ(){
        j=0;
    }


}
