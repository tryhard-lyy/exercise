
public class MyThread  extends Thread{

    @Override

    public void run(){

        try {

            //让线程休眠1s

        Thread.sleep(1000);

        }catch (InterruptedException e){

            e.printStackTrace();

        }

        for (int i = 0; i < 10; i++) {

            System.out.println("run="+i);

        }

    }

 

}

 

 

 

public class ThreadDemo01 {

    public static void main(String[] args) throws InterruptedException {

        //创建线程对象

        MyThread mt=new MyThread();

        System.out.println(mt.hashCode());

 

        //给线程设置名字

        mt.setName("下载文件A线程");

        //输出线程名字

        System.out.println(mt.getName());

        //开启线程

        mt.start();

        System.out.println("------------");

        //让当前线程休眠1s

        mt.sleep(1000);

        for (int i = 0; i < 10; i++) {

            System.out.println("main="+i);

        }

        //获得主线程对象

       Thread t=Thread.currentThread();

        //获得主线程名称

        System.out.println(t.getName());

    }

    private void test01(){

        //获得执行当前方法的线程对象

        Thread t=Thread.currentThread();

        //获得主线程名称

        System.out.println(t.getName());

    }

}
