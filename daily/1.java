1.	import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String ok = "符合条件";
        String no = "不符合条件";
        Scanner sc = new Scanner(System.in);
        System.out.println("掌握的编程语言：" );
        String pl = sc.next();
        if ("c,java".equals(pl)){
            System.out.println(ok);
        }else
            System.out.println(no);
        System.out.println("拥有3年以上工作经验或重点大学毕业（y/n）：");
        char j = sc.next().charAt(0);
        if('y'==j){
            System.out.println(ok);
        }else
            System.out.println(no);
        System.out.println("年龄：");
        int age = sc.nextInt();
        if(age>0&&age<35)
            System.out.println(ok);
        else
            System.out.println(no);
    }
}
