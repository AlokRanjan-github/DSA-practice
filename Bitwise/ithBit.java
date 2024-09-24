public class ithBit {

    public static int get_ith_bit(int binary, int index) {
        int bitMask = 1 << index;
        if ((binary & bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int set_ith_bit(int binary, int index) {
        int bitMask = 1 << index;
        return binary | bitMask;
        /*
        if ((binary | bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }*/
    }
    public static int clear_ith_bit(int binary, int index){
        int bitMask = ~(1<<index);
        return binary & bitMask; 
    }
    public static int update_ith_bit(int binary, int index, int newBit){
        /* 
        if (newBit == 0) {
            return clear_ith_bit(binary, index);
        }else {
            return set_ith_bit(binary, index);
        }
        */
        int n = clear_ith_bit(binary, index);
        int bitMask = newBit<<index;
        return n | bitMask;
    }

    public static int ClearTill_ith_bits(int binary, int index){
        // take & with (111111111111 i.e., (~0/-1) along with left shift till index position)
        int bitMask = (~0)<< index;
        return binary & bitMask;
    }

    public static int ClearBits_in_range(int binary, int i, int j){
        int a = (~0)<<j+1;         // ...11100000000000000 (j times 0 R->L) 
        int b = (1<<i)-1;            // ...00000000000000111 (i times 1 R->L)
        int bitMask = a|b;         // ...11100000000000111  (a | b is the bitmask)
        return binary & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(get_ith_bit(70, 4));
        System.out.println(set_ith_bit(70, 4));
        System.out.println(clear_ith_bit(70, 3));
        System.out.println(ClearTill_ith_bits(15, 2));
        System.out.println(ClearBits_in_range(10, 2, 4));
    }
}