/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class App {
    //k 4 variantu
    public void run(){
        Book book5 = new Book();
        book5.setTitle("212 stulyev");
        book5.addAuthor(createAuthor("AntonioNew","GonsalesNew"));
        System.out.println("************************");
        System.out.println(book5.toString());
        System.out.println("");
    }
    //k 5 variantu
    public void runNew(){
        Book book5 = createBook("2222212 stulyev");
        book5.addAuthor(createAuthor("Ivan","Ivanov"));
        System.out.println("************************");
        System.out.println(book5.toString());
        System.out.println("");
    }
    //dlja 4 i 5 variantam
    public Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    //k 5 variantu
    private Book createBook(String title){
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
}
