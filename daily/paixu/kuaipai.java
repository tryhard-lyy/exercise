class kuaipai{

    public static void main(String[] args){
        int[] nums = {3,4,1,2};
        sort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] arr,int low,int high){
        if(low<high){
            int sign = getSign(arr,low,high);
            sort(arr,low,sign-1);
            sort(arr,sign+1,high);
        }
    }

    public static int getSign(int[] arr,int low,int high){
        int temp = arr[low];
        while(low<high){
            while(low<high&&arr[high]>=temp){
                high--;
            }
            arr[low] = arr[high];
            while(low<high&&arr[low]<=temp){
                low++;
            }
            arr[high] = arr[low];

        }
        arr[low] = temp;
        return low;
    }

   }
