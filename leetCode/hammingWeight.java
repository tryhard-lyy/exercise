public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bit = 0;
        int m = 1;
        for(int i =0;i<32;i++){
            if((n & m) !=0){
                bit++;
            }

            m<<=1;
        }

        return bit;
    }
}
