package BookPack;

/**
 * Created by Demon on 24.01.2016.
 */
public class Book {
    protected String title;
    protected String author;
    protected int pubDate;
    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}
