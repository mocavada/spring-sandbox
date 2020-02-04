package moc.app.FunctionalProgramming_Advance.D_Streams;

public class Books {
    private String author;
    private String title;

    public Books(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return ("Author: " + author + " Title: " + title);
    }

}
