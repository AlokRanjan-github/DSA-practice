public class length {

    public static void strlength(String str,int i){
        if(str.length() == 0){
            System.out.println(i);
            return;
        }
        strlength(str.substring(1),i+1);
    }

    public static void main(String[] args) {
        strlength("Alok ranjan", 0);
    }
}
