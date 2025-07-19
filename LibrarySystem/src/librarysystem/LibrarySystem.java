/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarysystem;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class LibrarySystem {

   
    public static void main(String[] args) {
User user1=new User("ufuk","çöz");
user1.add();
ArrayList<Book> books = new ArrayList<>();
books.add(new Novel("psikoloji","suç ve ceza","dostoyeveski"));
books.add(new Academic("matematik","geometri","ATATÜRK"));
books.add(new Magazine(12,"gençbilim","tubitak"));
for(Book book:books){
    book.getInfo();
    book.borrowBook();
}
    }
    
}
