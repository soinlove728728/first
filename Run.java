class Stack{
    // int store[10]; // change here
    int pointer;

    //constructor
    public Stack(){
        // changes in this method
        pointer = -1;
    }
    int pop(){
        // changes in this method
        return 1;

    }

    void push(int i){
        return ;
    }


}

public class Run {

    public static void main(String[] args){
        Stack stk = new Stack();

        stk.push(1);
        System.out.println(stk.pop());
    }
}