package string;

/*Given a string s, find the length of the longest substring without repeating characters.*/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {  //TODO: improve this solution

    public int lengthOfLongestSubstring(String s) {
        int slow = 0, fast = 0;
        Set<Character> set = new HashSet();
        int count = 0, max = 0;

        while(slow < s.length() && fast < s.length()){
            if(!set.contains(s.charAt(fast))){
                set.add(s.charAt(fast));
                fast++;
                count++;
            }
            else{
                set.clear();
                slow++;
                fast=slow;
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
