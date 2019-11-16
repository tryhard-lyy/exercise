package baogao3.Test3;

import java.util.ArrayList;

public class Statistic {
    public static void statistic(String s){
        char[] chars = s.toCharArray();
        int word = 0;
        int num = 0;
        int space = 0;
        int other = 0;

        for(char item:chars){
            if((item<'z'&&item>'a') || (item<'Z'&&item>'A')){
                word++;
            }else if(item<'9'&&item>'0'){
                num++;
            }else if(item == ' '){
                space++;
            }else{
                other++;
            }
        }
        System.out.println("字母个数："+word+"\n数字个数："+num+"\n空格个数："+space+"\n其他个数："+other);

    }

    public static void main(String[] args) {
        String s = "I love you ,123*";
        Statistic.statistic(s);
    }
}
