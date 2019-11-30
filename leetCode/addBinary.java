class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int ca = 0;
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
            int sum = ca;
            sum += i>=0?a.charAt(i)-'0':0;
            sum += j>=0?b.charAt(j)-'0':0;
            str.append(sum%2);
            ca = sum/2;
        }

        str.append(ca==1?ca:"");

        return str.reverse().toString();
    }
}
