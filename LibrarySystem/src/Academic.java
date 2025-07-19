/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
package librarysystem;
public class Academic extends Book{
private String field;

    public Academic(String field, String tittle, String author) {
        super(tittle, author);
        this.field = field;
    }
    @Override
    public void getInfo() {
        System.out.println("academic "+field+" book");
    }
  
    public void Isreservable() {
        System.out.println("this book can reserveable");
    }
    
}
