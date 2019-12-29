package test;


import java.*;
import java.io.File;
import java.util.Scanner;

public class trysd {
		public static void main(String[] arg){
			
	      System.out.println("请输入文件名：");
		  Scanner sc = new Scanner(System.in);
		  String filename = sc.next();
		  //System.out.println(filename);
		  File myFile = new File("d://" + filename);
		  if(!myFile.exists()){
			  System.out.println("该文件不存在");
		  }else{
			  System.out.println("文件可读？" + myFile.canRead());
			  System.out.println("文件可写？" + myFile.canWrite());
			  System.out.println("文件大小？" + myFile.length() +"字节");
			  if(myFile.isFile()){
				  System.out.println("该文件是普通文件");
			  }else{
				  System.out.println("该文件是目录");
			  }
		  }
		  
		}
}
