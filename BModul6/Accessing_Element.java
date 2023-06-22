/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmodul6;
import java.util.Stack;
/**
 *
 * @author User
 */
public class Accessing_Element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        stack.push("Welcome");
        stack.push("TO");
        stack.push("Progam Studi");
        stack.push("Teknik");
        stack.push("Informatika"); 
        
        // Displaying the Stack
        System.out.println("Initial Stack:" + stack );
        
        //Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + stack.peek());
        
        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);       
    }
    
}
