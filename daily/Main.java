package exam;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a integer：");
        try{  int i = Integer.parseInt(in.readLine());
            System.out.println("Ten times of the number："+10*i);
            in.close();
        }catch(Exception e){
            System.err.println(e.toString());
        }
    }
}
