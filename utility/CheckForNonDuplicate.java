package utility;

public class CheckForNonDuplicate {

    int checkForOneNonDuplicate(){
        int arr[] = new int[]{1, 2, 3, 3, 2};
        int res = 0;
        for(int i = 0; i<arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
