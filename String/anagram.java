import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String str1 = "Heart";
        String str2 = "Earth";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if (str1.length() == str2.length()) {
            boolean result = Arrays.equals(str1Array,str2Array);
            if (result) {
                System.out.println(str1+" and "+str2+" are ANAGRAM. ");
            }
            else{
                System.out.println(str1+" and "+str2+" are NOT ANAGRAM. ");
            }
        }
        else{
            System.out.println(str1+" and "+str2+" are NOT ANAGRAM cuz length of entered strings aren't equal.");
        }
    }
}
