
package RandomCharacter;


/**
 * Chapter 3
 * @topic Print a random uppercase character
 * @name Combination numbers
 * @datek 03132015
 * @author Chohee Kim
 */

public class RandomCharacter {

    public static void main(String[] args) {
        
        int randomChar = (int)(Math.random() * 25 + 65);
        
        System.out.printf("%c \n",randomChar);
        
    }
    
}
