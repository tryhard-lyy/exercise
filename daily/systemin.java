import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
String string=sc.next();
char[] chars = null;
chars = string.toCharArray();
for (int j = chars.length; j >0; j--) {
System.out.print(chars[j-1]);
}
}
}
