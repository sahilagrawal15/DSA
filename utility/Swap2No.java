package utility;

public class Swap2No {
    String swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        return "swapped no's" + a + " " + b;
    }
}
