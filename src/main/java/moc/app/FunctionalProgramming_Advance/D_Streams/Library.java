package moc.app.FunctionalProgramming_Advance.D_Streams;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {

        System.out.println("\n1. LAZY and EAGER");

        ArrayList<Books> books = populateLibrary();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).filter(book -> {
            return book.getTitle().startsWith("E");
        }).forEach(System.out::println);

        System.out.println("\n2. USING PARALLEL STREAM");

        ArrayList<Books> parallelBooks = populateLibrary();
        parallelBooks.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).forEach(System.out::println);

    }


    static ArrayList<Books> populateLibrary() {
        ArrayList<Books> books = new ArrayList();
        books.add(new Books("Alice Walker", "The Color Purple"));
        books.add(new Books("Alice Walker", "Meridian"));
        books.add(new Books("Toni Morrison", "Beloved"));
        books.add(new Books("Toni Morrison", "Jazz"));
        books.add(new Books("Toni Morrison", "Paradise"));
        books.add(new Books("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Books("John Steinbeck", "East of Eden"));
        books.add(new Books("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Books("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Books("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Books("Jane Austen", "Pride and Prejudice"));
        books.add(new Books("Jane Austen", "Emma"));
        books.add(new Books("Jane Austen", "Persuasion"));
        books.add(new Books("Jane Austen", "Mansfield Park"));
        books.add(new Books("Chinua Achebe", "Things Fall Apart"));
        books.add(new Books("Chinua Achebe", "No Longer at Ease"));
        books.add(new Books("Chinua Achebe", "Home and Exile"));
        return books;
    }
}
