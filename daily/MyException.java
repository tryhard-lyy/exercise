package baogao;

public class Person {

    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        if(age < 0 || age > 120){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.ErrorInsert();
            }
        }
        this.sex = sex;
        if(!sex.equals("male") || !sex.equals("female")){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",130,"female");
        System.out.println(person1);
    }
}
