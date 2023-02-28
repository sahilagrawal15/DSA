package utility;

import java.util.Scanner;

public class EvenOdd {

    Scanner scanner = null;

    //Check if a number is Even / Odd
    public String checkEvenOrOdd(){
        int a = scanner.nextInt();
        if(a % 2 == 0) {
            return "even";
    }
        else
            return "odd";
    }
    //Check if a number is Even / Odd Using Bit
    public String checkEvenOrOddUsingBit(){
        int a = scanner.nextInt();
        if((a & 1) == 0) {
            return "even";
        }
        else
            return "odd";
    }

}
