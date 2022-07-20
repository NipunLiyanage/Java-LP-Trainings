package Memento;

import java.util.ArrayList;

public class Counter2 {

    ArrayList<Book2> books2 = new ArrayList<>();

    public void addBook(Book2 book2){
        books2.add(book2);
    }

    public ArrayList<Book2> getBooks2() {
        return (ArrayList<Book2>) books2.clone();
    }

    public Book2Memento returnBook(){
        return new Book2Memento(getBooks2());
    }

    public void lend(Book2Memento book2Memento){
        books2=book2Memento.getBooks2();
    }

    @Override
    public String toString() {
        return "Counter2{" +
                "books2=" + books2 +
                '}';
    }

    static class Book2Memento{

        ArrayList<Book2> books2;

        public Book2Memento(ArrayList<Book2> books2) {
            this.books2 = books2;
        }

        private ArrayList<Book2> getBooks2(){
            return books2;
        }
    }
}
