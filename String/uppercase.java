public class uppercase {
    public static void main(String[] args) {
        String str = "hello, i am alok ranjan. studying in VIT.";
        StringBuilder updatedStr = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        updatedStr.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1){
                updatedStr.append(str.charAt(i));
                i++;
                updatedStr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                updatedStr.append(str.charAt(i));
            }
        }
        System.out.println(str);
        System.out.print(updatedStr);
    }
}
