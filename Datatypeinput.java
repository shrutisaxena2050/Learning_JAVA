import java.util.*;
public class Datatypeinput{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    byte bytenum = sc.nextByte();
    System.out.println("Your byte value is: " +bytenum);
    short shortnum = sc.nextShort();
    System.out.println("Your short value is: " +shortnum);
    char word = sc.next().charAt(0);
    System.out.println("Your char value is: " +word);
    int intnum = sc.nextInt();
    System.out.println("Your integer value is: " +intnum);
    float floatnum = sc.nextFloat();
    System.out.println("Your float value is: " +floatnum);
    long longnum = sc.nextLong();
    System.out.println("Your long value is: " +longnum);
    double doublenum = sc.nextDouble();
    System.out.println("Your double value is: " +doublenum);
    String name = sc.nextLine();
    System.out.println("Your string value is: " +name);
    boolean b = sc.nextBoolean();
    System.out.println("Your boolean value is: " +b);
    

    }
    
}