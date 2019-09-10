package Chapter11;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> st = new LinkedList<T>();
    public void push(T v){st.addFirst(v);}
    public T peek(){return st.getFirst();}
    public T pop(){return st.removeFirst();}
    public boolean empty(){return st.isEmpty();}
    public String toString(){return st.toString();}

    public static void main(String[] args) {
        Stack<Character> ss = new Stack<Character>();
        ss.push('u');
        ss.push('j');
        System.out.println("ss = " + ss);
    }
}
