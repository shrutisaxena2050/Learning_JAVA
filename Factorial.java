import java.util.Scanner;
public class Factorial{
    public static void main(String []args){
        int num;
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("The num is:" +num);
        long sum=1;
        for(int i=1;i<=num;i++){
            sum=sum*i;
        }
        System.out.println("The factorial of the num is:" +sum);
    }
}