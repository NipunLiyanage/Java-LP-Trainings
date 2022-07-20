package Memento;

import java.util.Stack;

public class Record2 {

    Stack<Counter2.Book2Memento> record2 = new Stack<>();

    public void returnBook(Counter2 counter2){
        record2.push(counter2.returnBook());
    }

    public void lend(Counter2 counter2){
        if(!record2.isEmpty()){
            counter2.lend(record2.pop());
        }
        else{
            System.out.println("This book is currently not in the inventory");
        }
    }
}
