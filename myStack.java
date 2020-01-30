package com.company;

public class myStack {
    public int[] stack;
    public int top;
    public int size;

    public myStack() {
        top = -1;
        size = 10;
        stack = new int[10];
    }

    public myStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    public boolean push(int item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            return false;
        }
    }
    public int pop(){
        return stack[--top];
        }

    public boolean isFull() {
        return (top == stack.length - 1);
    }
}
