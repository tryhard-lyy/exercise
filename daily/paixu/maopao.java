public class maopao {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        sort(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void sort(int[] arr){
        int len = arr.length;
       for(int i = 0;i<len-1;i++){
           for(int j = 0;j<len-i-1;j++){
               if(arr[j+1]>arr[j]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
    }
}
