import java.util.Scanner;
public class Factorial{
    public static void main(String []args){
        int num;
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();                 //Taking input from user
        System.out.println("The num is:" +num);
        long sum=1;                         //Long is used for large values
        
        for(int i=1;i<=num;i++){             //Loop for factorial
            sum=sum*i;
        }
        System.out.println("The factorial of the num is:" +sum);
    }
}
