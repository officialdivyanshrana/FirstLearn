/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divyanshrana;

/**
 * Hey, I am Divyansh Rana.You don't know me but very soon you are gonna know me.
 * @author rdivy
 */
public class DivyanshRana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          // Take input word from the user
        String word = "HARJOT";

        // Store each character in the word in an array
        char[] charArray = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
        }

        // Print the word in reverse by iterating backwards over the array
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
    
}
