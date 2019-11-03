package baogao3.first;

public class Student {
    private String sname;
    private int age;

    public Student(String sname, int age) {
        this.sname = sname;
        this.age = age;
    }

    public String studyMethed(){
        return "大学生学习方法";
    }


    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
