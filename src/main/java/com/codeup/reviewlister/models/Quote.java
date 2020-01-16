package com.codeup.reviewlister.models;

public class Quote {

    private String quote;
    private String author;
    private long id;

    public Quote(String quote, String author, long id) {
        this.quote = quote;
        this.author = author;
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
