package Memento;

import java.util.Stack;

public class Record1 {

    Stack<Counter1.Book1Memento> record1 = new Stack<>();

    public void returnBook(Counter1 counter1){
        record1.push(counter1.returnBook());
    }

    public void lend(Counter1 counter1){
        if(!record1.isEmpty()){
            counter1.lend(record1.pop());
        }
        else{
            System.out.println("This book is currently not in the inventory");
        }
    }




}
