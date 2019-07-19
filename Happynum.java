import java.util.Scanner;
import java.util.HashSet;
public class Happynum{
    public static void main(String []args){
        int num;
        int rem;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();
        int temp = num;
        HashSet<Integer> hSet = new HashSet<Integer>();             //Creating object          
        System.out.println("The num you have entered:" +num);

        while(num != 0){                                          
 
                rem=num%10;                                       //Finding remainder
                num=num/10;
                sum = sum + rem*rem;                              //Adding the squares of remainder
                
                if(num <=0 ){
                    if(hSet.contains(sum)){                      //Checking if the sum is already in the set
                        System.out.println("The No is UnHappy");
                        break;
                    }
                    else{
                        hSet.add(sum);                         //Adding the sum in the set
                    }    

                    if(sum == 1){
                        System.out.println("the num is happy");
                        break;
                    }
                    else if(sum != 1){
                        num = sum;
                        sum = 0;
                    }
                }
        }
    }
}
