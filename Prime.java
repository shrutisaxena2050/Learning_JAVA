import java.util.*;

public class Prime{
public static void main(String[]args){
    
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    System.out.println("number:" +num);
    boolean ifprime=true;

    if(num==0|| num==1){                                   //Condition of not prime
        System.out.println("the num is not prime");                   
    }
    else{
    for(int i=2; i<=num/2; i++){                         //Condition of not prime
        if(num%i==0){
            ifprime=false;
            break;
        }
          }
    
    }
    if(ifprime){                                        //Outputs of conditions
        System.out.println("the num is prime");        
    }
    else{
        System.out.println("the num is not prime");
    }
}
}

