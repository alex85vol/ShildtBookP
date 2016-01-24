package Chapter8;

import BookPack.Book;

/**
 * Created by Demon on 24.01.2016.
 */
public class BookDemo {

    public static void bookDemo(){
        BookPack.Book books[] = new Book[5];
        books[0] = new BookPack.Book("Java: A Beginner's Guide",
                "Schildt", 2011);
        books[1] = new BookPack.Book("Java: The Complete Reference",
                "Schildt", 2011);
        books[2] = new BookPack.Book("The Art of Java",
                "Schildt and Holmes", 2003);
        books[3] = new BookPack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new BookPack.Book("On the Road",
                "Kerouac", 1955);
        for(int i=0; i < books.length; i++) books[i].show();

    }
}
