package utility;

public class ConvertLowercaseToUpperAndViceVersa {

    //We have A and a, and all char like this pattern
    /*B - > 1000010
      b - > 1100010
    The difference is that the 5th bit in lowercase is set
            The pattern is same for all the chars*/

    void toLower(){  //We will have to set the 5th bit, for that we will have a bit which will have 1 on 5th bit and we do OR
        char ch = 'B';

        //First way
        int res = ch | 1<<5;   //To set the bit

        //Second Way (This 1<<5 which is 100000 is equivalent to space in ASCII
        int res2 = ch | ' ';
    }
    void toUpper(){  //We will have to unset the 5th bit, for that we need to have a bit
        char ch = 'b';

        //First way
        int res = ch & (~(1<<5)); // To unset the bit we do this

        //Second Way (equivalent to _ in ASCII
        int res2 = ch & '_';
    }
}
