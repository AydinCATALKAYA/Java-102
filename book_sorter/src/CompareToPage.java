import java.util.Comparator;

public class CompareToPage implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getBookPage(), o2.getBookPage());
    }
}
