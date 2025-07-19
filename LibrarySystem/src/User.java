/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
package librarysystem;

import java.util.ArrayList;

public class User {
    private String name;
    private String Id;


    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }
public void add (){
    System.out.println(name+" added user");
}
    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
}
