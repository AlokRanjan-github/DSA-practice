public class removeDuplicates {

    public static void removeDup(String str, int index, StringBuilder newString, boolean map[]){
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar-'a'] == true) {
            // Duplicate
            removeDup(str, index+1, newString, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDup(str, index, newString.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String Str = "abbbbbbbbecdasjdj";
        StringBuilder newStr = new StringBuilder("");
        boolean[] map = new boolean[26];  //By default all values are false in boolean type array
        removeDup(Str, 0, newStr, map);
    }
}
