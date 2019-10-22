4.	import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] array = new float[100000];
        ArrayList<Float> arrayList = new ArrayList<Float>();

        for(int i = 0;i<array.length;i++){
            array[i] = in.nextFloat();
            if(array[i]<0){
                break;
            }
            arrayList.add(array[i]);
        }
        Object[] l = arrayList.toArray();
        Object max = l[0];
        Object min = l[0];

        for (int i = 1;i<l.length;i++){
            if((float)max < (float)l[i])
                max = l[i];
            if((float)min > (float)l[i])
                min = l[i];
        }

        DecimalFormat decimalFormat = new DecimalFormat(".0");
        String p = decimalFormat.format(max);
        DecimalFormat decimalFormat2 = new DecimalFormat(".0");
        String q = decimalFormat2.format(min);

        System.out.println("Max:"+p+" kg");
        System.out.println("Min:"+q+" kg");

    }
}
