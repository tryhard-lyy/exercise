class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gl ,sl;
        gl = sl = 0;
        int count = 0;
        while(gl<g.length&&sl<s.length){
            if(s[sl]>=g[gl]){
                gl++;
                count++;
            }
            sl++;
        }
        return count;
    }
}
