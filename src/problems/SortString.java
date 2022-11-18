package problems;

public class SortString {
    
    public static String sortString(String str) {
        str = str.toLowerCase();
        int[] array = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            try {
                array[index] = array[index] == 0 ? array[index] = 1 : array[index] + 1;
            } catch (Exception e) {
                System.out.println("Invalid char : " + str.charAt(i));
            }
            
        }
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                char ch = (char) (97 + i);
                builder.append(String.valueOf(ch).repeat(array[i]));
            }
        }
        System.out.println(builder);
        return builder.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(sortString("Gautam@#!Kumar"));
    }
}
