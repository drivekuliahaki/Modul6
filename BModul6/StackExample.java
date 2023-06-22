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
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new stack
        Stack <Integer> stack = new Stack<>();
        
        // push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        // pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    
}
