/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tet;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int a = Integer.parseInt(s.nextLine());
//        int b = Integer.parseInt(s.nextLine());
//        int x = Integer.parseInt(s.nextLine());
//        int y = Integer.parseInt(s.nextLine());
        //String op = s.nextLine();
//        ps g = new ps(a,b);
//        ps f = new ps(x,y);
//        ps c = new ps(g,f,op);
       Stack st = new Stack();
       st.push(s.nextInt());
       st.push(s.nextInt());
       st.push(s.nextInt());
       st.push(s.nextInt());
       st.push(s.nextLine());
       System.out.println(st);
       String op = (String) st.peek();
       st.pop();
       int y = (int) st.peek();
       st.pop();
       int x = (int) st.peek();
       st.pop();
       int b = (int) st.peek();
       st.pop();
       int a = (int) st.peek();
       st.pop();
        ps g = new ps(a,b);
        ps f = new ps(x,y);
        ps c = new ps(g,f,op);
        c.add(g, f);
        c.toString();
    }
}
