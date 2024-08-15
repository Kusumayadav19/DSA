package DSA.LEETCODE.JAVA;

// 14. Longest Common Prefix

/* Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */

public class LCP{
    public static String longestCommonPrefix(String[] strs){
        StringBuilder commonPrefix = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++){
            char letter = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++){
                if( i >= strs[j].length() || strs[j].charAt(i) != letter){
                    return commonPrefix.toString();
                }
            }
        commonPrefix.append(letter);
        }

    return commonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}