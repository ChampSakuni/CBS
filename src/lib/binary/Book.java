/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.binary;

/**
 *
 * @author Suyama
 *
 */
public class Book {

    private int Id;
    private String title;
    private String bookName;
    private String isbn;
    private String autorName;
    private String autorSurname;

    public Book() {
    
    }

    public Book(int Id, String title, String bookName, String isbn, String autorName, String autorSurname) {
        this.Id = Id;
        this.title = title;
        this.bookName = bookName;
        this.isbn = isbn;
        this.autorName = autorName;
        this.autorSurname = autorSurname;
    }

    public int getId() {
        return Id;
    }
    
    public String getTitle() {
        return title;
    }

    public String getBookName() {
        return bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutorName() {
        return autorName;
    }

    public String getAutorSurname() {
        return autorSurname;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public void setAutorSurname(String autorSurname) {
        this.autorSurname = autorSurname;
    }

}
