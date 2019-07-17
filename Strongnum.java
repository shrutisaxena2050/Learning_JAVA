import java.util.*;
public class Strongnum{
    public static void main(String[] args) {
        int num, rem;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        System.out.println("number:" +num);
        int temp=num;                       //Declaration of variables
        int sum=1;
        int strong=0;

        while(num != 0){                   //Finding remainder of the number
            rem=num%10;
            
            for(int i=1;i<=rem;i++){       //Finding factorial of the remainder
                sum = sum * i;
            }
            System.out.println("fact of "+ rem + "  is  " + sum);        
            strong=strong + sum;                                   //Addition of the factorials
            sum = 1;
            num=num/10;                                     
        }      
             
        if(temp == strong)  {                                     //Checking condition
            System.out.println("The number is a strong number");
        }
        else
            System.out.println("The number is not a strong number");
}
    
}