package string;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/
public class Anagram {

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int arr [] = new int[26];

        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<s.length(); i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i:arr){
            if(i!=0)
                return false;
        }
        return true;
    }
}
