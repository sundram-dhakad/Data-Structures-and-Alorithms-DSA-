package DSAPatterns;

import ArraysAndArrayList.Arrays;

public class SqrtDecomposition {
    public static void main(String[] args) {
        int [] arr = {3,4,1,9,8,7,6,4,5,20};
        int n = arr.length;

        int sqrt = (int)Math.sqrt(n);

        int [] blocks = new int[sqrt+1];
        
        int block_id = -1;
        for (int i = 0; i < n; i++) {
            if (i%sqrt == 0){
                block_id++;
            }
            blocks[block_id] += arr[i];
        }

        System.out.println(query(arr,blocks,2,7,sqrt));

    }

    public static int query(int[] arr, int[] blocks, int left, int right, int sqrt){
        int sum = 0;

        //left part
        while (left%sqrt != 0 && left<right && left != 0){
            sum += arr[left];
            left++;
        }

        //middle part
        while (left+sqrt <= right){
            sum += blocks[left/sqrt];
            left+=sqrt;
        }

        //right part
        while (left<=right){
            sum += arr[left];
            left++;
        }

        return sum;
    }

    //update
    public static void update(int [] arr, int[] blocks, int sqrt ,int value, int index){
        blocks[index/sqrt] = blocks[index/sqrt] - arr[index] + value;
        arr[index] = value;
    }
}
