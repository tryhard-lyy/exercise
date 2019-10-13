import java.text.DecimalFormat;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
float[] b= new float[100000];
ArrayList<Float> a=new ArrayList<Float>();
for(int i = 0 ;i<b.length;i++)
        { 
         b[i]=sc.nextFloat();
            if(b[i]<0) {
                break;
            }
            a.add(b[i]);
        }
     Object[] t=a.toArray();
Object max=t[0];
Object min=t[0];
        for(int i=1;i<t.length;i++)
        {
            if((float)max<(float)t[i])
                max=t[i];
        
            if((float)min>(float)t[i])
                min=t[i];
        
        }
        DecimalFormat decimalFormat=new DecimalFormat(".0");
        String p=decimalFormat.format(max);
        DecimalFormat decimalFormats=new DecimalFormat(".0");
        String q=decimalFormats.format(min);
        
    System.out.println("Max:"+p+" kg");
    System.out.println("Min:"+q+" kg");
    
}

}
