package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static List<String> getGenerateParenthesis(int n){
        List<String> res = new ArrayList<>();

        if(n == 0){
            return res;
        }

        DFS("",res,n,n);
        return res;
    }

    public static void DFS(String cur,List<String> res,int right,int left){
        if(right == 0&&left == 0){
            res.add(cur);
            return;
        }

        if(left > 0){
            DFS(cur+"(",res,right,--left);
        }
        if (right > 0 && left < right){
            DFS(cur+")",res,--right,left);
        }
    }

}
