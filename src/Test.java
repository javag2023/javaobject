import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        System.out.println(setInt);
        System.out.println(setInt.size());

        Book book1 = new Book(1, "test1");
        Book book2 = new Book(1, "test1");
        Book book3 = new Book(1, "test1");

        /*Set bookSet = new HashSet();
        bookSet.add(book1);
        bookSet.add(book2);*/

        System.out.println("Check whether the book1 and book2 are equal >>> " + book1.equals(book2));
        System.out.println("Check whether the book1 and book2 are equal " + (book1 == book2));
        System.out.println("Check whether the book1 and book2 are equal " + (1 == 1));


        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);//book2.equals(book1)
        bookSet.add(book3);//book3.equals(book1) book3.equals(book2)

        System.out.println(bookSet);
        System.out.println(bookSet.size());
    }
}
