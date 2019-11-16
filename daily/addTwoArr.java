package baogao3.Test3;

import java.util.ArrayList;
import java.util.List;

public class addTwoArr {
    public static void addArr(int[] a,int[] b){
        List<Integer> newArray = new ArrayList<>();

        int i = 0,j = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                newArray.add(a[i++]);
            }else{
                newArray.add(b[j++]);
            }
        }

        while(i<a.length){
            newArray.add(a[i++]);
        }
        while(j<b.length){
            newArray.add(b[j++]);
        }

        System.out.println(newArray);
    }

    public static void main(String[] args) {
        int[] a = {1,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
        addTwoArr.addArr(a,b);
    }
}
