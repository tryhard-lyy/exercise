package test;

import java.io.*;

import java.util.Scanner;

public class dierti {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream obj =null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		System.out.println("请输入学生信息：");
		int n = 3;
		while(n!=0){
			Student stu = new Student();
			System.out.println("姓名：");
			stu.setName(sc.next()); 
			System.out.println("学号：");
			stu.setNumber(sc.nextInt());
			System.out.println("成绩1：");
			stu.setScore1(sc.nextInt());
			System.out.println("成绩2：");
			stu.setScore2(sc.nextInt());
			System.out.println("成绩3：");
			stu.setScore3(sc.nextInt());
			n--;
			try {
				obj = new FileOutputStream("d://Student.dat");
				oos = new ObjectOutputStream(obj);
				oos.writeObject(stu);
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
