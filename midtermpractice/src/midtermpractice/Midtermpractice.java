/*
  A practice to find how many ms, ss, is, and ps are in "mississippi". 
 */
package midtermpractice;

import java.util.Scanner;
import static sun.org.mozilla.javascript.internal.ScriptRuntime.name;

/**
 * Midterm Study
 * @topic midterm study
 * @name mississippi
 * @date 03192015
 * @author Chohee Kim
 */

public class Midtermpractice {

    public static void main(String[] args) {

        char[] word = {'m','i','s','s','i','s','s','i','p','p','i'};
        int m = 0, i = 0, s = 0, p = 0;
        
        for(int ind = 0; ind < word.length ; ind ++){
            
            switch(word[ind]) {
                
                case 'm' : {
                    m++;
                    break;
                }
                case 'i' : {
                    i++;
                    break;                   
                }
                case 's' : {
                    s++;
                    break;
                    
                }
                case 'p' : {
                    p++;
                    break;
                }
                
            }
                       
            
        }
        
        System.out.printf("m : %d \ns : %d \ni : %d \np : %d\n",m,s,i,p);

    }

}
