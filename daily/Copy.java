package baogao3.Test3;

public class Copy {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] newa = new int[5];

        for (int item:array
                ) {
            System.out.print(" "+item);
        }
        System.arraycopy(array,1,newa,0,5);
        System.out.println("\n");
        for (int item:newa
             ) {
            System.out.print(" "+item);
        }
    }
}
