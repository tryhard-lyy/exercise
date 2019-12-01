class Solution {
    public void reverseString(char[] s) {
        int head = 0;
        int tail = s.length-1;
        int mid = s.length/2;
        while(head < mid){
            char temp = s[head];
            s[head] = s[tail];
            s[tail] = temp;
            head++;
            tail--;
        }

    }
}
