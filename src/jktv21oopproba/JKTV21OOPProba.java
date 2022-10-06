/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;

import java.util.Arrays;
import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class JKTV21OOPProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname("Lev");
        author1.setLastname("Tolstoy");
       
        Book book = new Book();
        book.setTitle("Voina i mir");
        book.addAuthor(author1);
        System.out.println(book.toString());
        System.out.printf("Book{authors = %s, title = %s}",
                Arrays.toString(book.getAuthors()), book.getTitle()
        );
        System.out.println("");
        
        
        Author author2 = new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        Author author3 = new Author();
        author3.setFirstname("Jevgeny");
        author3.setLastname("Petrov");
 
        Book book1 = new Book();
        book1.setTitle("Dvenadtsat stulyev");
        book1.addAuthor(author2);
        book1.addAuthor(author3);
        
        System.out.println(book1.toString());
        
    }
    
}
