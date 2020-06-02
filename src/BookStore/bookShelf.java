/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bookShelf extends book{
    private ArrayList<book> list;
    Scanner sc = new Scanner(System.in);
    public bookShelf() {
        list = new ArrayList<>();
    }
    public void input(){
        
        int id;
        int n;
        String name;
        String author;
        int dayRl;
        id = 100+list.size();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Author: ");
        author = sc.nextLine();
        System.out.println("Day release: ");
        dayRl = Integer.parseInt(sc.nextLine());
        list.add(new book(id, name, author, dayRl));
                
    }
    public void output(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            
        }
    }
    public void edit(){
        System.out.println("Insert id the book you want to edit: ");
        int ide;
        int index = -1;
        ide = Integer.parseInt(sc.nextLine());        
        while(true){
            for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == ide){
                index = i;
                break;
            } 
        }
            if(index != -1)
                break;
            else{
            System.out.println("Not found, pls insert again!");     
            ide = sc.nextInt();
            }
        }
        
        int id;
        int n;
        String name;
        String author;
        int dayRl;
        id = list.get(index).getId();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Author: ");
        author = sc.nextLine();
        System.out.println("Day release: ");
        dayRl = Integer.parseInt(sc.nextLine());  
        list.remove(list.get(index));
        list.add(new book(id, name, author, dayRl));
    }
}
