import java.util.*;
public class Datatypeinput{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);                      // Creating Object of Scanner Class
        
    byte bytenum = sc.nextByte();                            // Taking input of byte type from user
    System.out.println("Your byte value is: " +bytenum);     // Displaying the input
        
    short shortnum = sc.nextShort();                        //Taking input of short type from user
    System.out.println("Your short value is: " +shortnum);  // Displaying the input
        
    char word = sc.next().charAt(0);                        // Taking input of char type from user
    System.out.println("Your char value is: " +word);       // Displaying the input
        
    int intnum = sc.nextInt();                              // Taking input of int type from user
    System.out.println("Your integer value is: " +intnum);  // Displaying the input
        
    float floatnum = sc.nextFloat();                        // Taking input of float type from user
    System.out.println("Your float value is: " +floatnum);  // Displaying the input
        
    long longnum = sc.nextLong();                           // Taking input of long type from user
    System.out.println("Your long value is: " +longnum);    // Displaying the input
        
    double doublenum = sc.nextDouble();                     // Taking input of double type from user
    System.out.println("Your double value is: " +doublenum); // Displaying the input
        
    String name = sc.nextLine();                            // Taking input of string type from user
    System.out.println("Your string value is: " +name);     // Displaying the input
        
    boolean b = sc.nextBoolean();                           // Taking input of boolean type from user
    System.out.println("Your boolean value is: " +b);       // Displaying the input
    

    }
    
}
