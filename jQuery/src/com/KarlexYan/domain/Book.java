package com.KarlexYan.domain;

public class Book {
    private String name;
    private double price;
    private String author;


    public Book() {
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     *
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book{name = " + name + ", price = " + price + ", author = " + author + "}";
    }
}
