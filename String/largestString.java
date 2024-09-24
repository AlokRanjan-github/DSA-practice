public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","banana","potato","mango"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0 ) {         // compareTo (str1=str2 returns 0;  str1<str2 returns -ve;  str1>str2 returns +ve) 
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
