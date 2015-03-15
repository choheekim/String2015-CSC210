/*
 1. Liters and Gallons :  
    a.how many gallons is 26 liters?
    b.how many gallons is 3.58 liters?
    c.how many liters is 4.5 gallons? 
 2.Kilograms and Pounds:
    a.how many pounds is 56 kilogram?
    b.how many kilogram is 198.23 pounds?
 */
package converter;

/**
 * Class Assignment
 * @topic Datatype
 * @name Converter_CSC210 Assignment #3
 * @date 02092015
 * @author chohee
 */
public class Converter {
    public static void main(String[] args) {
        
        //Homework #1
        
        double Lit = 26.0, Gal = 4.5; 
        double LitToGal = Lit * 0.26; // 4.5 litters convert to gallons
        double GalToLit = Gal / 0.26; // 26.0 gallons convert to litters
  
        System.out.println("How many gallons is 26 liters? "+LitToGal);
            //print a result to standard out
        
        Lit = 3.58;
        LitToGal = Lit * 0.26;
                // 3.58 litters convert to gallons
        
        System.out.println("How many gallons is 3.58 liters? "+LitToGal); 
                //print a result to standard out
        System.out.println("How many liters is 4.5 gallons? "+GalToLit);
                //print a result to standard out
        
        //Homwork #2
        
        double kg = 56, pd = 198.23;
        double KgtoPd = kg * 2.2; // convert from Killograms to Pounds
        double PdtoKg = pd / 2.2; // convert from Pounds to Killograms
        
        System.out.println("\n\nHow many pounds is 56 kilogram? "+KgtoPd);
                    //print a result to standard out
        System.out.println("How many kilograms is 198.23 pounds? "+PdtoKg + "\n\n");
                    //print a result to standard out
        
        
        
        
    }
    
}
