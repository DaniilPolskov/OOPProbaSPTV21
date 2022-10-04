/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprobasptv21;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author user
 */
public class OOPProbaSPTV21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstName("Aleksandr");
        author1.setLastName("Pushkin");
        Book book1 = new Book();
        book1.setCaption("Evgeny Onegin");
        Author[] authors = new Author[1];
        authors[0]=author1;
        book1.setAuthors(authors);
        System.out.println(book1.toString());
    }
    
}
