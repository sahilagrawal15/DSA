package string;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {      // slow solution
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;

        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
