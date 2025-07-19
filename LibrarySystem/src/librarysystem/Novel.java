/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem;

/**
 *
 * @author hp
 */
public class Novel extends Book implements IsReservable {
private String type;

    public Novel( String type,String tittle, String author) {
        super(tittle, author);
        this.type=type;
      
    }
    @Override
    public void getInfo() {
        System.out.println("novel "+type+" book");
    }

    @Override
    public void Isreservable() {
        System.out.println(" this book unreserveable");    }
    
}
