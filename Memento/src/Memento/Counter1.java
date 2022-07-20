package Memento;

import java.awt.print.Book;
import java.util.ArrayList;

public class Counter1 {

    ArrayList<Book1> books1 = new ArrayList<>();

    public void addBook(Book1 book1){
        books1.add(book1);
    }

    public ArrayList<Book1> getBooks1() {
        return (ArrayList<Book1>) books1.clone();
    }

    public  Book1Memento returnBook(){
        return new Book1Memento(getBooks1());
    }

    public void lend(Book1Memento book1Memento){
        books1=book1Memento.getBooks1();
    }


    @Override
    public String toString() {
        return "Counter1{" +
                "books1=" + books1 +
                '}';
    }

    static class Book1Memento{

        ArrayList<Book1> books1;

        public Book1Memento(ArrayList<Book1> books1) {
            this.books1 = books1;
        }

        private ArrayList<Book1> getBooks1(){
            return books1;
        }
    }
}
