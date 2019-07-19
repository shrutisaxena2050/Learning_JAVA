import java.util.Scanner;
public class Happynum{
    public static void main(String []args){
        int num;
        int rem;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();
        System.out.println("The num you have entered:" +num);
        
        while(num != 0){
            
                rem=num%10; 
                num=num/10;
                sum = sum + rem*rem;
                System.out.println(sum);
                if(sum != 1){ 
                    num=sum;
                }
                else{
                    System.out.println(sum);
                }
        }
               int temp =num;
                if(temp==1){
                System.out.println("the num is happy");
                }
                else{
                    System.out.println("the num is NOT happy");
                }
                


}
}