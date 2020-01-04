package exam;

import java.util.Scanner;

public class Triangle {
    public boolean isTriangle(double a,double b, double c){
        boolean  flag=false;
        if ((a+b>c&&a+c>b&&c+b>a)&&(Math.abs(a-b)<c&&Math.abs(a-c)<b&&Math.abs(c-b)<a)){
            flag=true;
        }else {
            System.out.println("It can not create a triangle.");
        }
        return flag;
    }
    public double getArea(double a,double b, double c){
        return (1/4) * Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        a = Double.valueOf(sc.nextInt());
        b = Double.valueOf(sc.nextInt());
        c = Double.valueOf(sc.nextInt());

        Triangle tr = new Triangle();

        tr.isTriangle(a,b,c);
        System.out.println("The area is:" + tr.getArea(a,b,c));

        sc.close();
    }
}

