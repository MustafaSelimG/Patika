import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        byName();
        System.out.println("---------------------");
        byPage();

    }

    public static void byName(){
        TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());

        books.add(new Book("Macbeth", 160, "William Shakespeare", 1606));
        books.add(new Book("Savaş ve Barış", 547, "Lev Tolstoy", 1867));
        books.add(new Book("Otomatik Portakal", 176, "Anthony Burgess", 1962));
        books.add(new Book("Büyük Umutlar", 544, "Charles Dickens", 1861));
        books.add(new Book("Yeraltından Notlar", 140, "Fyodor Dostoyevsk", 1864));


        for (Book book : books){
            System.out.println(book.getName());
        }
    }

    public static void byPage() {
        TreeSet<Book> books = new TreeSet<>(new OrderPageComparator());

        books.add(new Book("Macbeth", 160, "William Shakespeare", 1606));
        books.add(new Book("Savaş ve Barış", 547, "Lev Tolstoy", 1867));
        books.add(new Book("Otomatik Portakal", 176, "Anthony Burgess", 1962));
        books.add(new Book("Büyük Umutlar", 544, "Charles Dickens", 1861));
        books.add(new Book("Yeraltından Notlar", 140, "Fyodor Dostoyevsk", 1864));


        for (Book book : books) {
            System.out.println(book.getPage());
        }

    }
}