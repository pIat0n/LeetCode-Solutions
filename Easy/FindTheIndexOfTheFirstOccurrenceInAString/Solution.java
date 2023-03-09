package Easy.FindTheIndexOfTheFirstOccurrenceInAString;

public class Solution {
    public static int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d",
            Solution.strStr("sadbutsad", "sad"),
            Solution.strStr("leetcode", "leeto"));
    }
}
