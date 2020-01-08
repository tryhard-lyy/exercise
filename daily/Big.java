import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        BigInteger a=null,b=null;
        if(str.contains("*")){
            int l=str.lastIndexOf("*");
            a=new BigInteger(str.substring(l+1));
           b=new BigInteger(str.substring(0,l));
            System.out.println(a.multiply(b));

        }else if(str.contains("/")){
            int l=str.lastIndexOf("/");
            a=new BigInteger(str.substring(l+1));
            b=new BigInteger(str.substring(0,l));
            System.out.println(b.divide(a));

        }else if(str.contains("+")){
            int l=str.lastIndexOf("+");
            a=new BigInteger(str.substring(l+1));
            b=new BigInteger(str.substring(0,l));
            System.out.println(a.add(b));
        }else if(str.contains("-")){
            int l=str.lastIndexOf("-");
            a=new BigInteger(str.substring(l+1));
            b=new BigInteger(str.substring(0,l));
            System.out.println(b.subtract(a));
        }
        br.close();
    }
}
