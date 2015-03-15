/*
    A program that prompts the user to enter three points of a triagle and 
    displays its area.
*/

package AreaOfATriangle;

import java.util.Scanner;

/**
 * Chapter 2
 * @topic Datatype
 * @name Geometry : Area of a triangle
 * @datek 03032015
 * @author Chohee Kim
 */
public class AreaOfATriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter three points for a triangle : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double distance1 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double distance2 = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
        double distance3 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
        
        
        double s = (distance1 + distance2 + distance3)/2;
        
        double area = Math.sqrt( s * (s - distance1) * (s - distance2) * (s - distance3));
        
        System.out.println(area);
        
        
    }
        
        
        
        
        
    }
    

