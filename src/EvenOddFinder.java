import java.util.Arrays;
import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number we want to check for even or odd : ");
//
//        int number = scanner.nextInt();
//
//        if(number % 2 == 0) {
//            System.out.println("Number is even");
//        }
//        else{
//            System.out.println("Number is odd");
//        }



//        for(int number = 100; number >= 1; number--) {
//            System.out.println(number + " ");
//        }

//       int number = 49;
//        while(--number >= 1) {
//            System.out.println(number + " ");
//            number--;
//        }


//        do{
//            System.out.println(number + " ");
//        }
//        while (number-- > 1);
//        for(int i = 1; i <= 10; i++) {
//            int j = i*5;
//            System.out.println(j);
//        }

//  if they we press 1 then it add 2 it is sub if they will press 3 it is multiply and 4 for division ( 2 numbers only)

        System.out.println("Enter 1 for ADD , 2 For SUB, 3 for MUL, 4 for DIV");

        int operator = scanner.nextInt();
        System.out.println("Enter two values to operator : ");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        switch (operator) {
            case 1:
                int add = value1 + value2;
                System.out.println("Addition of " + value1 + " and " + value2 + " = " + add);
                break;
            case 2:
                int diff = value2 - value1;
                System.out.println("Subtraction of " + value1 + " and " + value2 + " = " + diff);
                break;
            case 3:
                int mul = value2*  value1;

                System.out.println("Multiplication of " + value1 + " and " + value2 + " = " + mul);

                break;
            case 4:
                int div =   value1 / value2;

                System.out.println("Division of " + value1 + " and " + value2 + " = " + div);
                break;
        }

    }
}
/*


control statements  :-
if and else , they can be nested as well

flow statement :-
for , while, do ... while
 */