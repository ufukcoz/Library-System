/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarysystem;

/**
 *
 * @author hp
 */
public class Magazine extends Book implements IsReservable{
private int seasonNumber;

    public Magazine(int seasonNumber, String tittle, String author) {
        super(tittle, author);
        this.seasonNumber = seasonNumber;
    }
    @Override
    public void getInfo() {
        System.out.println("magazine "+seasonNumber+" book");
    }

    @Override
    public void Isreservable() {
        System.out.println("this book can reserveable");    }
    
}
