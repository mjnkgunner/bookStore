/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

/**
 *
 * @author Admin
 */
public class book {
    private int id;
    private String name;
    private String author;
    private int dayRl;

    public book(int id, String name, String author,int dayRl) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.dayRl = dayRl;
    }
    public book(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   
    public int getDayRl() {
        return dayRl;
    }

    public void setDayRl(int dayRl) {
        this.dayRl = dayRl;
    }

    @Override
    public String toString() {
        return "book{" + "id=" + id + ", name=" + name + ", author=" + author + ", dayRl=" + dayRl + '}';
    }
        
}
