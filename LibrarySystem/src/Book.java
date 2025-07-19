
package librarysystem;
public abstract class Book  {
    public abstract  void getInfo();
     private String tittle;
     private String author;
     private boolean isAvaible=true;

    public Book(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }
     public void borrowBook(){
         if(isAvaible){
             System.out.println(tittle+ " borrowed book");
         isAvaible=false;}
         else{
             System.out.println("not avaible");
         }
     } 
     public void returnBook(){
         isAvaible=true;
         System.out.println("returned book");
     }
}
