/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;

import java.util.Arrays;
import myclasses.Book;
import tools.Tools;
/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Tools tools = new Tools();
        Book[] books = new Book[5];
        for (int i = 0; i < 5; i++) {
           books[i] = tools.createBook();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Book{%n\t%s%n\tAuthors=%s%n}%n",books[i].getTitle(),Arrays.toString(books[i].getAuthors()));
        }

    }
}
