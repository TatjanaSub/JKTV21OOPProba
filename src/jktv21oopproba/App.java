/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;

import java.util.Arrays;
import java.util.Scanner;
import myclasses.Author;
import myclasses.Book;
import tools.Tools;

/**
 *
 * @author pupil
 */
public class App {
    // 6 variant
     public void run(){
        Scanner scanner = new Scanner(System.in);
        Tools tools = new Tools();
//        Book book = tools.createBook("2222212 stulyev");
//       book.addAuthor(tools.createAuthor("Ivan","Ivanov"));
//       System.out.println("************************");
//        System.out.println(book.toString());
//        System.out.println("");
        Book book;
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nazvanie knigi: ");
            String title = scanner.nextLine();
            book = new Book();
            book.setTitle(title);
            System.out.println("Skolko avtorov v etoi knige: ");
            int countAuthorsInBook = scanner.nextInt();
            scanner.nextLine();
            String firstname = "";
            String lastname = "";
            for (int j = 0; j < countAuthorsInBook; j++) {
                System.out.println("Imja avtora "+(j+1)+": ");
                firstname = scanner.nextLine();
                System.out.println("Familija avtora "+(j+1)+": ");
                lastname = scanner.nextLine();
                book.addAuthor(tools.createAuthor(firstname, lastname));
            }
            
            books[i] = book;
        }
         System.out.println(Arrays.toString(books));
    }
    /*
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
    */
    /*
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
    */
}
