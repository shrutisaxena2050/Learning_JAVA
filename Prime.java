import java.util.*;


public class Prime{
public static void main(String[]args){
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    System.out.println("number:" +num);

    if(num==0|| num==1){
        System.out.println("the num is not prime");
    }
    else{
    for(int i=2; i<=num/2; i++){
        if(num%i==0){
            System.out.println("the num is not prime");
            break;
        }
        else{
            System.out.println("the num is prime");
            break;
        }
          }
    
    }
}
}

