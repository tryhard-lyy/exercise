public class charu {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        sort(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void sort(int[] arr){
       int len = arr.length;
       for(int i = 1;i<len;i++){
           int pre = i-1;
           int cur = arr[i];
           while(pre>=0 && arr[pre]>cur){
               arr[pre+1] = arr[pre];
               pre--;
           }
           arr[pre+1] = cur;
       }
    }
}
