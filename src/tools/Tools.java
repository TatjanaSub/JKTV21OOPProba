/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;
import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
    public class Tools {
        
        Scanner scanner = new Scanner(System.in);
        
        public Author[] createAuthors(int countAuthorsInBook){
            Author[] authors = new Author[countAuthorsInBook];
            for (int i = 0; i < countAuthorsInBook; i++) {
                System.out.println("Imja avtora "+(i+1)+": ");
                String firstname = scanner.nextLine();
                System.out.println("Familija avtora "+(i+1)+": ");
                String lastname = scanner.nextLine();
                Author author = new Author();
                author.setFirstname(firstname);
                author.setLastname(lastname);
                authors[i] = author;
            }
            return authors;
        }
        public Book createBook(){
            Book book = new Book();
            System.out.println("Nazvanie knigi: ");
            book.setTitle(scanner.nextLine());
            System.out.println("Skolko avtorov v etoi knige: ");
            int countAuthorsInBook = scanner.nextInt();
            scanner.nextLine();
            book.setAuthors(createAuthors(countAuthorsInBook));
            return book;
        }
        
}
