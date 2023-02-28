package utility;

public class SetUnset {

    //Bit is set ,means it is 1
    //Bit is unset, means it is 0

    /*To check for set bit at a particular index, we take a number with that bit to 1, and do & with the original Number
            if the number is zero, that original bit was zero else 1
            We take no like 4th index to be 1<<4 and do AND with the original number*/

    public Integer setBitAti(){
        int a = 5;
        int i = 2; //for 2nd bit
        a = a | (1<<i);
        return a;
    }

    public Integer unsetBitAti(){
        //For that we take take at that index and inverse that number and do AND
        int a = 5;
        int i = 2; //for 2nd bit
        a = a & (~(1<<i));
        return a;
    }

    public Integer toggleBit(){
        int a = 5;                               //a = 101  here we are setting it to 001
        int i = 2; //for 2nd bit
        // for this we take a number with 1 on that index, and do XOR with the original number
        // XOR do on/off for bits
        a = a ^ (1 << i);
        return a;
    }


}
