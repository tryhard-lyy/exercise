import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Demo {
    // 新建AtomicIntegerFieldUpdater对象，需要指明是哪个类中的哪个字段
    private static AtomicIntegerFieldUpdater<User> atom = AtomicIntegerFieldUpdater.newUpdater(User.class, "id");

    public static void main(String[] args) {
        User user = new User(100, 100);
        System.out.println("调用atom.addAndGet(user, 50)方法返回值为：" + atom.addAndGet(user, 50));
        System.out.println("调用后值变为：" + user);

        System.out.println("调用getAndDecrement(user)方法返回值为：" + atom.getAndDecrement(user));
        System.out.println("调用后值变为：" + user);

        System.out.println("调用compareAndSet(user, 149, 200)方法返回值为：" + atom.compareAndSet(user, 149, 200));
        System.out.println("调用后值变为：" + user);
    }
}

class User {
    volatile int id;
    volatile int age;
    public User(int id, int age) {
        this.id = id;
        this.age = age;
    }
    
    public String toString() {
        return "id：" + id + " " + "age：" + age;
    }
}
