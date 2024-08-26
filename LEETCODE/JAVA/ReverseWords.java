// 151. Reverse Words in a String - Level(medium) Topic (Two Pointers,String)

public class ReverseWords {
    public static String ReverseString(String str){
        String[] listWords = str.trim().split("\\s+");

        int left = 0, right = listWords.length - 1;
        while(left < right){
            String temp = listWords[left];
            listWords[left] = listWords[right];
            listWords[right] = temp;
            left++;
            right--;
        }
    return String.join(" ", listWords);
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(ReverseString(str));
    }
}
