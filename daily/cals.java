import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        BigInteger a=null;
        BigInteger b=null;
        if(str.contains("*")){
        String []s=str.split("\\*");
        a=new BigInteger(s[0]);
        b=new BigInteger(s[1]);
        System.out.println(a.multiply(b));
        }else if(str.contains("/")){
            String []s=str.split("/");
            a=new BigInteger(s[0]);
            b=new BigInteger(s[1]);
            System.out.println(a.divide(b));
        }else if(str.contains("+")){
            String []s=str.split("\\+");
            a=new BigInteger(s[0]);
            b=new BigInteger(s[1]);
            System.out.println(a.add(b));
        }else{
            String []s=str.split("-");
            a=new BigInteger(s[0]);
            b=new BigInteger(s[1]);
            System.out.println(a.subtract(b));
        }
}
}
