
package midterm_10;

/**
 * Reviewing Midterm
 * @topic While loop
 * @name Q #10
 * @datek 04072015
 * @author Chohee Kim
 */

public class MidTerm_10 {

    public static void main(String[] args) {
        
        int i = 0;
        int[] numbers = {4, 18, 6, 2, 80};
        
        while(i < numbers.length) {
            
            if(numbers[i] % 2 == 0) {
                
                System.out.printf("Element %d, %d is even number \n",i,numbers[i]);
            }else{
                System.out.printf("%d is odd numbers \n",i,numbers[i]);
            }
            i++;
        }
        
    }
    
}
