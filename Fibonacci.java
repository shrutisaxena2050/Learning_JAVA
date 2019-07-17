import java.util.*;             
public class Fibonacci{
    public static void main(String []args){
        
        int a=-1,b=1,result, num;                // Declaration of variables
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();                      //User input of num
        System.out.println("Fibonacci series upto: " +num );
        
        for(int i=0;i<num;i++){                 //Loop of fibonacci
            result= a+b;
            a=b;
            b=result;
            System.out.print(" "+result+" ");
        }

    }
}
