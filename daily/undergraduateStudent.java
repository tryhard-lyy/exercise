package baogao3.first;

public class undergraduateStudent extends Student {
    private String zhuanye;
    private String xuewei;

    public undergraduateStudent(String sname, int age, String zhuanye, String xuewei) {
        super(sname, age);
        this.zhuanye = zhuanye;
        this.xuewei = xuewei;
    }

    @Override
    public String studyMethed() {
        return "本科学习方法";
    }

    @Override
    public String toString() {
        return "undergraduateStudent{" +
                "zhuanye='" + zhuanye + '\'' +
                ", xuewei='" + xuewei + '\'' +
                '}';
    }
}
