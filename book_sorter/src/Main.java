import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 350, "John Smith", "2020-01-15");
        Book book2 = new Book("Python Basics", 250, "Alice Johnson", "2019-06-20");
        Book book3 = new Book("Data Structures and Algorithms", 500, "David Brown", "2021-03-10");
        Book book4 = new Book("Web Development with HTML & CSS", 200, "Emily Clark", "2018-12-05");
        Book book5 = new Book("Introduction to Algorithms", 700, "Thomas Lee", "2022-05-30");


        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

        System.out.println("------------------ Books Sorted by Name ------------------");
        for (Book book : bookSetByName){
            System.out.println(book);
        }

        Set<Book> bookCompareByPage = new TreeSet<>(new CompareToPage());

        bookCompareByPage.add(book1);
        bookCompareByPage.add(book2);
        bookCompareByPage.add(book3);
        bookCompareByPage.add(book4);
        bookCompareByPage.add(book5);

        System.out.println("------------------ Books Sorted by Page ------------------");

        for (Book book : bookCompareByPage){
            System.out.println(book);
        }
    }
}