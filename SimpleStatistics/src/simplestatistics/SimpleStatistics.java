package simplestatistics;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class Assignment
 * @topic Exception Handling
 * @name Simple Statistics Assignment #10
 * @date 04152015
 * @author Chohee Kim
 */
public class SimpleStatistics {

    static Scanner input = new Scanner(System.in);

    
    //1. this method obtains X numbers from the user and Store the user provided valued into an array of doubles.
    public static double[] getUserInput() {
        int cnt = 0;
        int sizeOfArr = 0;
        boolean invalid = true;

        //Catch InputMismatchException. User only can input possible integer.
        do {
            System.out.print("Enter the size of array : ");
            try {               
                sizeOfArr = input.nextInt();
                if(sizeOfArr < 0) {
                    throw new IllegalArgumentException();
                }
                invalid = false;
            }catch (InputMismatchException ex) {
                System.out.println("Invalid Value. Please input integer.");
                input.next();
            }catch (IllegalArgumentException ex) {
                System.out.println("Invalid Value. Please input numbers bigger than or equal to 0.");
            }
            
        } while (invalid);

        double[] arr = new double[sizeOfArr];

        //Store provided values but if size of array is 0, it passes.
        while (sizeOfArr != 0 && cnt < sizeOfArr) {
            try {
                System.out.printf("Enter the number (%d) : ", cnt + 1);
                double number = input.nextDouble();
                arr[cnt] = number;
                cnt++;
            } catch (InputMismatchException ex) {
                System.out.printf("Invalid Value. Please enter appropriate number. \n%s\n", ex.toString());
                input.next();
            }

        }

        return arr;
    }

    //2. This method returns the arithmetic mean of the numbers.
    public static double arithmeticMean(double[] nums) {

        int leng = nums.length;
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //throw an exception when the length is 0. numbers/0 is not valid.
        if (leng == 0) {
            throw new ArithmeticException();
        }

        return sum / leng;
    }

    //3. This method returns the geometric mean of the numbers.
    public static double geometricMean(double[] nums) throws Exception {

        int sum = 1;
        int leng = nums.length;
        
        //When the size of array is 0, there is no valiable in the array, so that 
        //geometric mean can't be calculated.
        if(leng == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < nums.length; i++) {
            sum *= nums[i];
        }
        //Throw an exception b/c in the square root, negative numbers can't be calculated. 
        if (sum < 0) {
            throw new Exception();
        }
        System.out.println(sum);
        return Math.pow(sum, 1.0 / leng);
    }

    //3. This method returns the smallest number and the largest number.
    public static double[] minAndmax(double[] arr) throws Exception {

        double[] maxAndmin = {arr[0], arr[0]};

        if (arr.length == 0) {
            throw new Exception();
        }
        for (int i = 0; i < arr.length; i++) {

            //find the largest number in the array.
            if (maxAndmin[0] < arr[i]) {
                maxAndmin[0] = arr[i];
            }
            //find the smallest number in the array.
            if (maxAndmin[1] > arr[i]) {
                maxAndmin[1] = arr[i];
            }
        }
        return maxAndmin;
    }

    //This method multipies every number provided by the first input parameter.
    public static double[] scaleUp(double[] nums, double factor) throws Exception {

        //When factor is smaller than 1, throw an exception.
        if (factor < 1) {
            throw new IllegalArgumentException();
        }

        //throw an exception when it is an empty array.
        if (nums.length == 0) {
            throw new Exception();
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] *= factor;
        }

        return nums;
    }
    //This method divides every number provided by the first input parameter.
    public static double[] scaleDown(double[] nums, double factor) throws Exception {
        //When factor is smaller than 1, throw an exception.
        if (factor < 1) {
            throw new IllegalArgumentException();
        }
        //throw an exception, when the array is empty.
        if(nums.length == 0) {
            throw new Exception();
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] /= factor;
        }

        return nums;
    }

    public static void main(String[] args) {

        double[] mainArr = getUserInput();
        int opt = 0;
        boolean invalid = true;

        do {

            do {
                try {
                    //display an option and the user with 6 possible choices and prompt user to pick one.
                    System.out.print("1. Arithmetic mean \n2. Geometric mean \n3. minAndmax \n4. Scale up \n5. Scale down \n6. Exit"
                            + "\nEnter the number above an option : ");
                    opt = input.nextInt();
                    if(opt< 1 || opt > 6){
                        throw new IllegalArgumentException();
                    }
                    invalid = false;
                }catch (InputMismatchException ex) {
                    opt = 0;
                    System.out.println("Please enter number from 1 to 6.\n");
                    input.next();
                }catch( IllegalArgumentException ex){
                    opt = 0;
                    System.out.println("Please enter number from 1 to 6.\n");  
                }
            } while (invalid);

            System.out.println();
            
            switch (opt) {
                //arithmetic mean
                case 1: {
                    try {
                        System.out.printf("Artimetic Mean : %f \n\n", arithmeticMean(mainArr));
                    } catch (ArithmeticException ex) {
                        System.out.println("Numbers can't be divided by 0.\n");
                    }
                    break;
                }
                //geometric mean
                case 2: {
                    try {
                        System.out.printf("Geometric Mean : %f \n\n", geometricMean(mainArr));
                    }catch(ArrayIndexOutOfBoundsException ex){
                        System.out.println("There are no valiables in the array.\n");
                    }catch (Exception ex) {
                        System.out.println("Sum of the numbers can't be less than 0.\n");
                    }
                    break;
                }
                //Maximum and Minimum values.
                case 3: {
                    double[] minmax;
                    try {
                        minmax = minAndmax(mainArr);
                        System.out.printf("Maximum Value : %f \nMinimum Value : %f \n\n", minmax[0], minmax[1]);
                    } catch (Exception ex) {
                        System.out.println("There are no valiables in the array.\n");
                    }
                    break;
                }
                //Scale up.
                case 4: {
                    try {
                        //prompt the user to input factor to mutiply
                        System.out.print("Enter the number to mutiply : ");
                        int factor = input.nextInt();
                        scaleUp(mainArr, factor);
                        //display mutiplied array.
                        for (int i = 0; i < mainArr.length; i++) {
                            System.out.print(mainArr[i] + "   ");
                        }
                        System.out.println();
                    }catch (IllegalArgumentException ex) {
                        System.out.println("The factor has to be at least 1.0");
                    }catch (InputMismatchException ex) {
                        System.out.println("Invalid factor. Input has to be integer at least 1.0. \n");
                    }catch(Exception ex) {
                        System.out.println("There are no valiables in the array.");
                    }
                    System.out.println();
                    break;
                }
                //scale down.
                case 5: {
                    try {
                        //prompt the user to input the number to divide.
                        System.out.print("Enter the number to divide : ");
                        int factor = input.nextInt();
                        scaleDown(mainArr, factor);
                        //display divided array.
                        for (int i = 0; i < mainArr.length; i++) {
                            System.out.print(mainArr[i] + "   ");
                        }
                        System.out.println("\n");
                    } catch (IllegalArgumentException ex) {
                        System.out.println("The factor has to be at least 1.0.");
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid factor. Input has to be integer at least 1.0. \n");
                    }catch(Exception ex) {
                        System.out.println("There are no valiables in the array.");
                    }
                    break;
                }default : {
                    continue;
                }
            }
        //terminate the program when the user input 6 to exit.
        } while (opt != 6);

    }

}
