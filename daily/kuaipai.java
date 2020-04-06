package com.lyy.test;


import java.util.Arrays;

/**
 * 快速排序：通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，则分别
 * 对这两部分继续进行排序，直到整个序列有序。
 *
 * @author BaoZi
 * @create 2019-05-15-18:15
 */
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
            int middle = getMiddle(arr,low,high);
            sort(arr,low,middle-1);
            sort(arr,middle+1,high);
        }
    }
    public static int getMiddle(int[] arr,int low,int high){
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
