

import java.util.*;


public class Armstrong{
public static void main(String[]args){
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    System.out.println("number:" +num);
    int a = num;
    int n=0;
    while(a > 0){                 //To find the length of the num
        a= a/10;
        n=n+1;
     }
    int b = num;
    int rem;
    int sum=0;
    
    while(b>0){
        int mul=1;
        rem=b%10;
        for(int i=1; i<=n; i++){
            mul=mul*rem;

        }
        sum=sum+mul;
        b=b/10;
    }
    if(num==sum){
        System.out.println("The num is Armstrong");
    }
    

}
}