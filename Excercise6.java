package decision_making;

import java.util.Scanner;

public class  Excercise6 {
    public static void main(String[] args) {
       int number =1;

       while (true){
           if( number % 5 == 0 && number % 7 == 0 && number % 11 == 0 ){
               System.out.printf("So %d chia het cho 5,7,11", number);
               break;
           } else {
               number++;
           }
       }

    }
}
