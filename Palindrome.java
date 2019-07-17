import java.util.Scanner;

public class Palindrome{
    public static void main(String []args){
        int num, rem, revnum=0;
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("The number you have inserted:" +num);
        int temp=num;
        while(num != 0){
            rem= num%10;
            revnum= (revnum*10) + rem;
            num=num/10;
        }
        if(temp==revnum){
            System.out.println("The number you have inserted is a palindrome number");
        }
        else{
            System.out.println("The number you have inserted is not palindrome");
        }
    }
}