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
        
    // 1 variant: kniga s odnim avtorom
    // cherez massiv Author[]  и setAuthors
        Author author1 = new Author();
        author1.setFirstname("Lev");
        author1.setLastname("Tolstoi");
        
        Author[] authors1 = new Author[1];
        authors1[0] = author1;
        Book book = new Book();
        book.setTitle("Voina i mir");
        book.setAuthors(authors1);
        System.out.println(book.toString());
        System.out.println("");
        
     // 2 variant kniga s odnim avtorom
     // через get  печать
     // через addAuthor
        Author author10 = new Author();
        author10.setFirstname("Lev");
        author10.setLastname("Tolstoy");
       
        Book book10 = new Book();
        book10.setTitle("Voina i mir");
        book10.addAuthor(author10);
        
        System.out.println(book10.toString());
        // вывод на печать через get
        System.out.printf("Book{authors = %s, title = %s}",
                Arrays.toString(book10.getAuthors()), book10.getTitle()
        );
        
        System.out.println("");
        System.out.println("********************************");
        
    //*****************************************************    
       // kniga s 2 avtorami
       
       // 1 variant
        Author author2 = new Author();
        Author author3 = new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        author3.setFirstname("Jevgeny");
        author3.setLastname("Petrov");
        Author[] authors2 = new Author[2];
        authors2[0] = author2;
        authors2[1] = author3;
        Book book1 = new Book();
        book1.setTitle("Dvenadtsat stulyev");
        book1.setAuthors(authors2);
        
//        System.out.println(book1.toString());
        System.out.printf("Book{authors = %s, title =%s}",Arrays.toString(book1.getAuthors()),book1.getTitle());
        System.out.println("");
        System.out.println("");
    
        // 2-oi variant
        
        Author author20 = new Author();
        author20.setFirstname("Ilja");
        author20.setLastname("Ilf");
        Author author30 = new Author();
        author30.setFirstname("Jevgeny");
        author30.setLastname("Petrov");
 
        Book book3 = new Book();
        book3.setTitle("Dvenadtsat stulyev");
        book3.addAuthor(author20);
        book3.addAuthor(author30);
        
        System.out.println(book3.toString());
        
        //3 variant
        //sozdali createAuthorold 
        Book book4 = new Book();
        book4.setTitle("12 stulyev");
        
        book4.addAuthor(createAuthorold("Antonio","Gonsales"));
        
        book4.addAuthor(author1);
        book4.addAuthor(author2);
        book4.addAuthor(author3);
        System.out.println("************************");
        System.out.println(book4.toString());
        System.out.println("");
        
        //4 i 6 variant
        // cherez app
        
        App app = new App();
        app.run();
 /*       
        //5 variant
        // cherez app
        App app1 = new App();
        app1.runNew();
*/
    }
    
    
    public static Author createAuthorold(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    
}
