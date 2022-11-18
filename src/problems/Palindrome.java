package problems;

public class Palindrome {
    
    public static boolean palindrome(String str, int start, int end) {
        
        if (start == end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        if (start < end) return palindrome(str, start + 1, end - 1);
        return true;
    }
    
    public static void main(String[] args) {
        
        String str = "aabbbbbaa";
        System.out.println(palindrome(str, 0, str.length() - 1));
    }
}
