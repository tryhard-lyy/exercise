package Exercise;

public class biSearch {
    public static int search(int[] array,int n){
        int left = 0;
        int right = array.length-1;
        int mid;

        while(right>left){
            mid = (right + left) / 2;
            if(array[mid] == n){
                return mid;
            }else if(array[mid] > n){
                right = mid;
            }else{
                left = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,8,9,10};
        int n = 9;

        System.out.println(search(array,n));
    }
}
