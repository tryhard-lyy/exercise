package baogao3.first;

public class postgraduateStudent extends undergraduateStudent {
    private String point;

    public postgraduateStudent(String sname, int age, String zhuanye, String xuewei, String point) {
        super(sname, age, zhuanye, xuewei);
        this.point = point;
    }

    public String studyMethed(){
        return "研究生学习方法";
    }

    @Override
    public String toString() {
        return "postgraduateStudent{" +
                "point='" + point + '\'' +
                '}';
    }
}
