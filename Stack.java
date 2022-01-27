package com.practice;

public class Stack
{
    private int []array;
    private int size;
    private int top;
    private int counter;
    public Stack(int x)
    {
        size=x;
        array=new int[size];
        counter=0;
        top=-1;
    }
    public void  push(int temp)
    {
        if(top < size-1)
        {
            top++;
            array[top] = temp;
        }
        else if(top == size-1)
        {
            System.out.println("stack overflow");
        }
    }
    public int pop()
    {
        int temp;
        if(top >= 0)
        {
            temp = array[top];
            top--;
            return temp;
        }
        else
        {
            System.out.println("Stack underflow");
            return -1;
        }
    }
    public void traverse()
    {
        if(top == -1)
        {
            System.out.println("The stack is empty");
            return;
        }
        else if(counter <= top)
        {
            counter++;
            traverse();
            counter--;
            System.out.print(array[counter] + " ");
        }
    }
    public int peek()
    {
        return array[top];
    }
    public int search(int temp)
    {
        for(int i=0;i<=top;i++)
        {
            if(array[i]==temp)
            {
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
