import java.util.*;
public class Perfectnum{
    public static void main (String []args){
        int num;
        Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            System.out.println("entered num:" +num);
            int sum=0;
        
            for(int i=1;i<num; i++){                  //Finding and checking divisors
                if(num%i==0){
                    sum=sum+i;                        // adding divisors
                  }
               }
        
                if(sum==num){                        //Checking condition
                    System.out.println("the number is perfect number");
                  }
                else{
                    System.out.println("the number is not a perfect number");
                  }

      }
}
