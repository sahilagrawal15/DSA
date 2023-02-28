package utility;

import java.util.Scanner;

public class MultiplyDivideBy2 {

    Scanner scanner = null;
    public String multipleAndDivideUsingBits(){
        int a = scanner.nextInt();

        //Multiply by 2
        int mul = a << 1;
        int div = a >> 1;

        return mul + "" + div;
    }
}
