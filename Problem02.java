import java.util.*;

class Problem02{
    public static int Fibonacci(){
        int item = 0;
        int item2 = 1;
        int temp = 0, sum = 0;
        while(item <= 4000000){
            temp = item + item2;
            item = item2;
            item2 = temp;
            if(temp % 2 == 0){
                sum += temp;
            }
        }

        return sum;
    }

    public static void main(String[] args){
        System.out.println(Fibonacci());
    }
}