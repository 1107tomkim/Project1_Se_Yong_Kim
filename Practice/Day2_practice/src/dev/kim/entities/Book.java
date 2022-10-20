package dev.kim.entities;

public class Book {
    private int id; // if you don't give a value it defaults to the default value, for ints that is 0
    private String title; // For string, the default value is "" ( an empty string)
    private String author;
    private long return_date; // We will cheat and combine this with "isCheckedOut" boolean value by making 0 =  isNotCheckedOut

    // If I create a no-args book, it is empty and a perfect model to insert values into.


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", return_date=" + return_date +
                '}';
    }

    public Book() { // no - args constructor
    }



    public Book(int id, String title, String author, long return_date) { //  all args constructor
        this.id = id;
        this.title = title;
        this.author = author;
        this.return_date = return_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getReturn_date() {
        return return_date;
    }

    public void setReturn_date(long return_date) {
        this.return_date = return_date;
    }
}
