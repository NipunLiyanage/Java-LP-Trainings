package Memento;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Counter1 counter1 = new Counter1();
        Counter2 counter2 = new Counter2();
        Record1 record1 = new Record1();
        Record2 record2 = new Record2();

        counter1.addBook(new Book1("Book1"));
        record1.returnBook(counter1);
        System.out.println(counter1);
        counter1.addBook(new Book1("Book1"));
        record1.returnBook(counter1);
        System.out.println(counter1);
        counter1.addBook(new Book1("Book1"));
        record1.returnBook(counter1);
        System.out.println(counter1);
        counter1.addBook(new Book1("Book1"));
        //record1.returnBook(counter1);
        System.out.println(counter1);

        record1.lend(counter1);
        System.out.println(counter1);

        record1.lend(counter1);
        System.out.println(counter1);

        record1.lend(counter1);
        System.out.println(counter1);

        record1.lend(counter1);
        System.out.println(counter1);
        record1.lend(counter1);
        System.out.println(counter1);

        counter1.addBook(new Book1("Book1"));
        System.out.println(counter1);


        System.out.println("\n");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\n");

        counter2.addBook(new Book2("Book2"));
        record2.returnBook(counter2);
        System.out.println(counter2);

        counter2.addBook(new Book2("Book2"));
        record2.returnBook(counter2);
        System.out.println(counter2);

        counter2.addBook(new Book2("Book2"));
        record2.returnBook(counter2);
        System.out.println(counter2);

        counter2.addBook(new Book2("Book2"));
        //record2.returnBook(counter2);
        System.out.println(counter2);

        record2.lend(counter2);
        System.out.println(counter2);

        record2.lend(counter2);
        System.out.println(counter2);

        record2.lend(counter2);
        System.out.println(counter2);


        System.out.println(counter2);















    }
}
