import java.text.DecimalFormat;


import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
while(sc.hasNext()){
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if(x<=1000&&y<=1000&z<=1000) {
double aa=y*y-4*x*z;
double x1,x2;
DecimalFormat decimalFormat=new DecimalFormat("0.00");
x1 = (-y + Math.sqrt(aa)) / 2 / x;
x2 = (-y - Math.sqrt(aa)) / 2 / x;
if(aa>0) {
    System.out.println("x1="+decimalFormat.format(x1)+","+"x2="+decimalFormat.format(x2));
}
else if(aa==0) {
    System.out.println("x="+decimalFormat.format(x1));
}
else if(aa<0);
    }else break;}}
}
