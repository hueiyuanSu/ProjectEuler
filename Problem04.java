import java.util.*;

class Problem04{
    public static int sumOfSquare(int p){
        int sum = 0;
        for(int i=1;i<=p;i++){
            sum = sum + i*i;
        }
        return sum;
    }

    public static int squareOfSum(int p){
        int sum = 0;
        for(int i=1;i<=p;i++){
            sum += i;
        }
        
        return sum*sum;
    }

    public static void main(String[] args){
        System.out.println(squareOfSum(100)-sumOfSquare(100));
        System.out.println(sumOfSquare(100));
    }
}