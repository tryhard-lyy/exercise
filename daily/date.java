package com.lyy.schooltest;

public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void judge(){
        if(day>31){
            day -= 31;
            month += 1;
            if(month>12){
                month -= 12;
                year +=1;
            }
        }else if(day<0){
            day += 31;
            month -= 1;
            if(month<0){
                month += 12;
                year -= 1;
            }
        }
    }
    public void yesterday(){
       day -= 1;
       judge();
    }
    public void qiantian(){
        day-=2;
        judge();
    }
    public void tomorrow(){
        day+=1;
        judge();
    }
    public void houtian(){
        day+=2;
        judge();
    }

    @Override
    public String toString() {
        return "Date:" + year +
                "年" + month +
                "月" + day +
                '日';
    }
}
package com.lyy.schooltest;

public class Test {

    public static void main(String[] args) {
        Date d = new Date(2019,10,22);
        d.yesterday();
        System.out.println(d);
    }
}
