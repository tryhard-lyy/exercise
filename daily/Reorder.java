public class PossibleReordering {
    static int x = 0, y = 0;
    static int a = 0, b = 0;
    public static void main(String[] args)throws InterruptedException {
            Thread one = new Thread(new Runnable() {//线程A
                        public void run() {
                            a = 1;//step 1
                            x = b;//step 2
                        }
                            });
            Thread other = new Thread(new Runnable() {//线程B
                        public void run() {
                            b = 1;//step 3
                            y = a;//step 4
                        }
                            });
            one.start(); other.start();
            one.join(); other.join();
            System.out.println("( "+ x + "," + y + ")");
    }
}
