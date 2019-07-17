import java.util.*;
public class Fibonacci{
    public static void main(String []args){
        int a=-1,b=1,result, num;
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Fibonacci series upto: " +num );
        for(int i=0;i<num;i++){
            result= a+b;
            a=b;
            b=result;
            System.out.print(" "+result+" ");
        }

    }
}