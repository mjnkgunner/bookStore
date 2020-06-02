/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int choice;
        bookShelf bS= new bookShelf();
        Scanner sc = new Scanner(System.in);
        do{
           
            System.out.println("==============Menu=============");
        System.out.println("1.Add");
        System.out.println("2.Edit");
        System.out.println("3.Info");
        System.out.println("4.Exit");
        System.out.println("Your choice...");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Your choice is add.");
                bS.input();
                break;
            case 2:
                System.out.println("Your choice is edit.");
                bS.edit();
                break;
            case 3:
                System.out.println("Your choice is info.");
                bS.output();
                break;
            case 4:
                System.out.println("Now fuck off.");
                break;
            default:
                System.out.println("Your choice is not correct.");
                break;
                
        }
        }while(choice != 4);
    }
}
