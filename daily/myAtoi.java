class Solution {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int index = 0;
        //去除空格
        while(index<len&&chars[index]==' '){
            index++;
        }
        if(index==len){
            return 0;
        }
        //判断正负号
        boolean sign = false;//sign为true为负数
        if(chars[index]=='+'){
            index++;
        }else if(chars[index]=='-'){
            index++;
            sign = true;
        }else if(!Character.isDigit(chars[index])){
            return 0;
        }
        //整数
        int result=0;
        while(index<len&&Character.isDigit(chars[index])){
            int pop = chars[index]-'0';
            if(result>(Integer.MAX_VALUE-pop)/10)return sign?Integer.MIN_VALUE:Integer.MAX_VALUE;
            result = result * 10 + pop;
            index++;
        }

        return sign?-result:result;
    }
}
