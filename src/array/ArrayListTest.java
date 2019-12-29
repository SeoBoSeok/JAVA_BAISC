package array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<Book>();

        list.add(new Book("JAVA", "JAVA A"));
        list.add(new Book("SPRING", "SPRING A"));
        list.add(new Book("JAVASCRIPT", "JAVASCRIPT A"));

        System.out.println(list.size());
        System.out.println(list.get(0).returnBookInfo());

        list.forEach(item -> System.out.println("item : " + item.returnBookInfo()));

    }

}
