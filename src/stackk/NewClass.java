/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class NewClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i < 5; i++){
            s.push(i);
        }
        Queue q = new LinkedList();
        for(int i=0; i < 5; i++){
            q.add(i);
        }
        for(int i=0; i < 5; i++){
            System.out.println(q.peek());
            q.remove(i);
        }
//        Iterator<Integer> i = s.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
    }
}
