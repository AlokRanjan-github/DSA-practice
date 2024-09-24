public class shortestPath {
    public static float getShortestPath(String str){
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            
                default:
                    break;
            }
        }
        float disp = (float) Math.sqrt((x*x)+(y*y));
        return disp;
    }
    public static void main(String[] args) {
        String direction = "EWNSS";
        System.out.println(getShortestPath(direction));;
    }
}
