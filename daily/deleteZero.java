package baogao3.Test3;

public class deleteZero {

    public static void delete(int[] array){
        int count = 0;
        for(int item : array){
            if(item!=0){
                count++;
            }
        }
        int[] newArray = new int[count];

        int j = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] != 0){
                newArray[j] = array[i];
                j++;
            }
        }

        for(int item:newArray){
            System.out.print(item);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        deleteZero.delete(array);
    }
}
