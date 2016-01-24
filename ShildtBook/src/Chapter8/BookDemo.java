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

    public static void extDemo(){
        ExtBook books[] = new ExtBook[5];
        books[0] = new ExtBook("Java: A Beginner's Guide",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        books[1] = new ExtBook("Java: The Complete Reference",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003,
                "Osborne/McGraw-Hill");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road",
                "Kerouac", 1955, "Viking");
        for(int i=0; i < books.length; i++) books[i].show();
        System.out.println("Showing all books by Schildt.");
        for(int i=0; i < books.length; i++)
            if(books[i].getAuthor() == "Schildt")
                System.out.println (books [i].getTitle());

    }

    public static void ByTwosDemo(){
        ByTwos ob = new ByTwos();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " +
                    ob.getNext ());
        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " +
                    ob.getNext());
        System.out.println("\nStarting at 100");
        ob.setStart(100) ;
        for(int i=0; i < 5; i++)
        System.out.println("Next value is " +
                ob.getNext());

    }
}
