/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmodul6;
import java.util.Stack;
/**
 *
 * @author Comp_9
 */
public class Removing_Elements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating an empty Stack
        Stack <Integer> stack = new Stack <Integer>();
        
        // Use add() method to add elements
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);
        
        // Displaying the stack
        System.out.println("Initial Stack : " + stack);
        
        // Removing elements using pop() method
        System.out.println("Popped element : " + stack.pop());
        System.out.println("Popped element : " + stack.pop());
        
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack);
    }
    
}
