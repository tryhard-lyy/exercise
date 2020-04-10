public class xuanze {
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
         int min = i;
         for(int j = i+1;j<len;j++){
             if(arr[j]<arr[min]){
                 min = j;
             }
         }
         int temp = arr[min];
         arr[min] = arr[i];
         arr[i] = temp;
     }
    }
}
