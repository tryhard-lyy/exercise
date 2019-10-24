6.	import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            double aa = y * y - 4 * x * z;
            double x1, x2;
            DecimalFormat Format = new DecimalFormat("0.00");
            //一元一次方程
            if (x == 0) {
                x1=(double)(-z)/y;
                System.out.println("x=" + Format.format(x1));
            } else {
                if (aa >= 0) {
                    //只有一个实数根
                    if (aa == 0)
                    {
                        x1 = (-y + Math.sqrt(aa)) / 2 / x;
                        x2 = (-y - Math.sqrt(aa)) / 2 / x;
                        System.out.println("x=" + Format.format(x1));
                    }

                    if (aa>0)
                    {
                        x1 = (-y + Math.sqrt(aa)) / 2 / x;
                        x2 = (-y - Math.sqrt(aa)) / 2 / x;
                        System.out.println("x1=" + Format.format(x1) + ',' + "x2=" + Format.format(x2));
                    }

                }
            }
        }
    }
}
