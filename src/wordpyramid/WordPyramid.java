/*
 * Mouner Dabjan 
 * 4/6/2020
 * This program removes the outsides of a word entered by a user until it reaches 1 or 2 characters 
 */
package wordpyramid;
import javax.swing.*; 
/**
 *
 * @author User
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // getting the user's input 
        String input = JOptionPane.showInputDialog("Enter your word"); 
        // calling the recursive method 
        System.out.println(pyramid(input));
    }
    
    public static String pyramid(String word){
        // checking if we can work with the size of the word the user entered 
        if (word.length()==1 || word.length()==2){
            // return the original word if yes 
            return word; 
        }
        else {
            // if not - start with the origirnal word 
            System.out.println(word);
            // the method will keep calling itself until it reacher either 1 or 2 characters long 
            return pyramid(word.substring(1, word.length() -1)); 
        }
    }
    
}
