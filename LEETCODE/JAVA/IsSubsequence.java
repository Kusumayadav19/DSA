
// 392. Is Subsequence - Level(Easy) - Topic(String,Two Pointer, Dynamic Programming)

public class IsSubsequence{
    public static boolean Subsequence(String s, String t){
        int left = 0, right = 0;

        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
            }
            right++;
        }

    return left == s.length();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t  =  "ahbgdc";
        Boolean result = Subsequence(s,t);
        System.out.println(result);
    }
}

