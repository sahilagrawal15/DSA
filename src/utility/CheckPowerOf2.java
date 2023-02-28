package utility;

public class CheckPowerOf2 {

    void check(int n){
        if((n & (n-1)) == 0){
            System.out.println("Power of 2");
        }
        else
            System.out.println("Not Power of 2");
    }
}
