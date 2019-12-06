class Solution {
    public int myAtoi(String s) {
       int result = 0;
        int i = 0;
        //跳过空格
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        //判断是否溢出
        if(i == s.length()){
            return result;
        }
        //找符号
        int flag = 1;
        char c = s.charAt(i);
        if(c == '+'){
            flag = 1;
            i++;
        }else if(c == '-'){
            flag = -1;
            i++;
        }

        //取数字
        for(;i<s.length();i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                break;
            }

            //大数溢出判断
            if (flag > 0 && result > Integer.MAX_VALUE / 10)
                return Integer.MAX_VALUE;
            if (flag > 0 && result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)
                return Integer.MAX_VALUE;
            if (flag < 0 && -result < Integer.MIN_VALUE / 10)
                return Integer.MIN_VALUE;
            if (flag < 0 && -result == Integer.MIN_VALUE / 10 && -(s.charAt(i) - '0') < Integer.MIN_VALUE % 10)
                return Integer.MIN_VALUE;


            result = result * 10 + s.charAt(i) - '0';
        }

        return result * flag;
    }
}
