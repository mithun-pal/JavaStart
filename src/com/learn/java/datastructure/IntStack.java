package com.learn.java.datastructure;

public class IntStack {
    private int[] stack;
    private int top;
    private int size;

   public IntStack(){
       top=-1;
       size=10;
       stack = new int[size];
   }
    public IntStack(int size){
        top=-1;
        this.size=size;
        stack = new int[size];
    }
    public int length(){
     return this.size;
    }
    public boolean push(int item){
      if(!isFull()){
          top++;
          stack[top]=item;
          return true;
      } else
          return false;
    }
   public int pop() throws EmptyStackException{
      if(isEmpty()){
        throw new EmptyStackException("Stack is empty");
       }
      else {
          return stack[top--];
       }
    }

    public boolean isFull(){
        return (top == stack.length - 1);
    }
    public boolean isEmpty(){
       return (top == -1);
    }
}
