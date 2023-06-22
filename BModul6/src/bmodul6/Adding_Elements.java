/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmodul6;
import java.util.Stack;
/**
 *
 * @author Comp_9
 */
public class Adding_Elements {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Default initialization of stack
        Stack stack1 = new Stack();
        
        // Initialization of stack
        // using generics
        Stack <String> stack2 = new Stack <String> ();
        
        // pushing the elements
        stack1.push("4");
        stack1.push("Teknik");
        stack1.push("Informatika");
        
        stack2.push("Teknik");
        stack2.push("Informatika");
        stack2.push("Politeknik");
        stack2.push("Hasnur");
        
        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
    
}