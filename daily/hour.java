package com.lyy.schooltest;

public class BeijingTime {
    private int hour;
    private int minute;
    private int second;

    public BeijingTime(int hour) {
        this.hour = hour;
    }

    public BeijingTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public BeijingTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

   public void printAll(){
        if(hour<24&&hour>=0){
            if(minute<60&&minute>=0){
                if(second<60&&second>=0){
                    System.out.println("BeijingTime："+ hour + ":" + minute + ":" + second);
                }
            }else
                System.out.println("时间输入错误");
        }else
            System.out.println("时间输入错误");
   }
}


public class Test {

    public static void main(String[] args) {
        BeijingTime ba = new BeijingTime(1);
        ba.printAll();
    }
}
